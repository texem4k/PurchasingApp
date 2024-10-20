package org.ulpgc.is1.model;

import java.time.LocalDate;

public class Product {
    private static int idCounter=0;
    private final int id;
    private String name;
    private String description;
    private int price;
    private ProductCategory category;
    private Discount discount;
    private Purchase purchase;

    public Product(String name, String description, int price, ProductCategory category) {
        this.id =idCounter++ ;
        this.setName(name);
        this.setDescription(description);
        this.setPrice(price);
        this.discount = null;
        this.category = category;
    }

    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getPrice() {
        return this.price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public ProductCategory getCategory() {
        return this.category;
    }
    public void setCategory(ProductCategory category) {
        this.category = category;
    }
    public void setDiscount(LocalDate to, LocalDate from, int percentage) {
        this.discount = new Discount(to, from, percentage);
    }
    public float getDiscount(){
        if(discount==null){
            return 0;}
        return this.discount.getPercentage();
    }

    protected void addPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    @Override
    public String toString(){
        String str = "\t*) Datos del producto:\n";
        str += "\t\t|- Código: " + this.id + "\n";
        str += "\t\t|- Nombre: " + this.name + "\n";
        str += "\t\t|- Descripcion: " + this.description + "\n";
        str += "\t\t|- Categoria: " + this.category + "\n";
        str += "\t\t|- Precio: " + this.price + "\n";
        if(this.discount==null){
            str += "\t\t|- Descuento: No Aplicado\n";
        } else {
            str += "\t\t|- Descuento: Aplicado\n";
            str += this.discount.toString();
        }
        return str;
    }
}