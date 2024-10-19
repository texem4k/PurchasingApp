package org.ulpgc.is1.model;

import java.time.LocalDate;

public class Product {
    private static int idCounter=0;
    private final int id;
    private String name;
    private String description;
    private float price;
    private ProductCategory category;
    public Discount discount;
    Purchase purchase;

    public Product(String name, String description, float price, ProductCategory category) {
        this.id =idCounter++ ;
        setName(name);
        setDescription(description);
        setPrice(price);
        this.discount = null;
        this.category = category;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
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
    public void setDiscount(LocalDate to, LocalDate from, float percentage) {
        this.discount = new Discount(to, from, percentage);
    }

    public float getDiscount(){
        if(discount==null){
            return 0;}
        return this.discount.getPercentage();
    }

    public int getId() {
        return this.id;
    }

}