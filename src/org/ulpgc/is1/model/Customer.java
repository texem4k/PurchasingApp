package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private String surname;
    private Email email;
    private List<Address> deliveryAddress;

    public Customer(String name, String surname, Email email) {
        setName(name);
        setSurname(surname);
        setEmail(email);
        deliveryAddress = new ArrayList<Address>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public List<Address> getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(List<Address> deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}