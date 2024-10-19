package org.ulpgc.is1.model;

import java.time.LocalDate;

public class Purchase {
    private static int NEXT_ID = 0;
    private final int id;
    private LocalDate date;
    private Customer customer;
    private Product product;
    private Address deliveryAddress;
    private Payment payment;

    public Purchase(LocalDate date, Customer customer, Product product, Address deliveryAddress) {
        this.id = NEXT_ID++;
        this.date = date;
        this.customer = customer;
        this.product = product;
        this.deliveryAddress = deliveryAddress;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public int getPrice() {
        return product.getPrice();
    }

    public int getDiscountedPrice() {
        return (int)(this.getPrice() * (1 - (product.getDiscount()/100)));
    }

    public void payPurchase(LocalDate date, int amount, String card) {
        if (this.payment == null) {
            this.payment = new Payment(date, amount, card);
        }
    }
}
