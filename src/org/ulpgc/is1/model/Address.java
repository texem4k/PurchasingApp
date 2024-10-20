package org.ulpgc.is1.model;

public class Address {
    private String address;
    private int number;
    private int postalCode;
    private String city;

    public Address(String address, int number, int postalCode, String city) {
        this.address = address;
        this.number = number;
        this.postalCode = postalCode;
        this.city = city;
    }

    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getNumber() {
        return this.number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getPostalCode() {
        return this.postalCode;
    }
    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
    public String getCity() {
        return this.city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return this.address + " número " + this.number + " en " + this.city + " (CP: " + this.postalCode + ")";
    }
}
