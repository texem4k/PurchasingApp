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
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
}
