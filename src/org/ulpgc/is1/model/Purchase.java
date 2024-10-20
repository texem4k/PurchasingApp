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
        return this.id;
    }
    public LocalDate getDate() {
        return this.date;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    public Product getProduct() {
        return this.product;
    }
    public Address getDeliveryAddress() {
        return this.deliveryAddress;
    }
    public int getPrice() {
        return this.product.getPrice();
    }
    public int getDiscountedPrice() {
        return (int)(this.getPrice() * (1 - (this.product.getDiscount()/100)));
    }

    public void payPurchase(LocalDate date, int amount, String card) {
        if (this.payment == null) {
            this.payment = new Payment(date, amount, card);
        }
    }

    @Override
    public String toString() {
        String str = "\t\t  Compra (cod." + this.id + "):\n";
        str += "----------------------------------------\n";
        str += "\t*) Datos de la compra:\n";
        str += "\t\t|- Fecha de la compra: " + this.date.toString() + "\n";
        str += "\t\t|- Punto de entrega: " + this.deliveryAddress.toString() + "\n";
        str += "\t\t|- Precio de la compra: " + this.getDiscountedPrice() + " euros.\n";
        if (this.payment == null) {
            str += "\t\t|- Pago: Compra no pagada\n";
        } else {
            str += "\t\t|- Pago: Compra pagada\n";
            str += this.payment.toString();
        }
        str += this.product.toString();
        str += "----------------------------------------\n";
        return str;
    }
}
