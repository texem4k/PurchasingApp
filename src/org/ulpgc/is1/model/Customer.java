package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private String surname;
    private Email email;
    private List<Address> deliveryAddress;
    private List<Purchase> purchases;

    public Customer(String name, String surname, Email email) {
        this.setName(name);
        this.setSurname(surname);
        this.setEmail(email);
        this.deliveryAddress = new ArrayList<Address>();
        this.purchases = new ArrayList<Purchase>();
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return this.surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getEmail() {
        return this.email.getEmail();
    }
    public void setEmail(Email email) {
        this.email = email;
    }
    public List<Address> getDeliveryAddress() {
        return this.deliveryAddress;
    }
    public void setDeliveryAddress(List<Address> deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
    protected List<Purchase> getPurchases() {
        return this.purchases;
    }

    protected void addPurchase(Purchase purchase) {
        this.purchases.add(purchase);
    }
    protected void addAddress(String street, int number, int zip, String city) {
        Address address = new Address(street, number, zip, city);

        for (Address address1 : getDeliveryAddress()) {
            if(address1.equals(address)) {
                System.out.println("El dirección ya registrada");
                return;
            }
        }
        this.deliveryAddress.add(address);
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname + " (email: " + this.email.getEmail() + ")";
    }
}