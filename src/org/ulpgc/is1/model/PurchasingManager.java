package org.ulpgc.is1.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PurchasingManager {

    private List<Customer> customers;
    private List<Product> products;

    public PurchasingManager() {
        customers = new ArrayList<Customer>();
        products = new ArrayList<Product>();
    }

    public void addCustomer(String name, String surname, Email email) {
        customers.add(new Customer(name, surname, email));
    }

    public Customer getCustomer(String name, String surname) {
        for (Customer customer : customers) {
            if (customer.getName().equals(name) && customer.getSurname().equals(surname)) {
                return customer;
            }
        }
        return null;
    }

    public void addProduct(String name, String description, float price, ProductCategory category) {
        products.add(new Product(name, description, price, category));
    }

    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public void purchase(LocalDate date, Customer customer, Product product, Address deliveryAddress) {
        Purchase purchase = new Purchase(date, customer, product, deliveryAddress);
        customer.addPurchase(purchase);
        product.addPurchase(purchase);
    }

    public List<Purchase> getPurchaseList(Customer customer) {
        return customer.getPurchases();
    }
}