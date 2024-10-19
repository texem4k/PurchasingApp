package org.ulpgc.is1.model;

import java.time.LocalDate;

public class Product {
    private final int id;
    private String name;
    private String description;
    private int price;
    private ProductCategory category;
    public Discount discount;
    Purchase purchase;

    public Product(String name, String description, int price, ProductCategory category) {
        this.id = 0;
        setName(name);
        setDescription(description);
        setPrice(price);
        setCategory(this.category);
        this.discount = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    protected void addPurchase(Purchase purchase) {
        this.purchase = purchase;
    }
    public void setDiscount(LocalDate to, LocalDate from, int percentage, ProductCategory category) {
        Discount discount = new Discount(to, from, percentage, category);
    }
}