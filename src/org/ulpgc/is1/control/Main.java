package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear el gestor de compras
        PurchasingManager purchasingManager = new PurchasingManager();

        // Crear dos clientes, asegurando que no sean repetidos
        Email email1 = new Email("cliente1@gmail.com");
        Email email2 = new Email("cliente2@gmail.com");

        purchasingManager.addCustomer("Juan", "Pérez", email1);
        purchasingManager.addCustomer("Ana", "Gómez", email2);

        // Crear dos productos, controlando que no sean repetidos
        ProductCategory category = ProductCategory.Clothing;
        Product product1 = new Product("Camiseta", "Camiseta de algodón", 20, category);
        Product product2 = new Product("Pantalón", "Pantalón de mezclilla", 30, category);

        purchasingManager.addProduct(product1.getName(), product1.getDescription(), product1.getPrice(), category);
        purchasingManager.addProduct(product2.getName(), product2.getDescription(), product2.getPrice(), category);

        // Crear un descuento para el primer producto
        product1.setDiscount(LocalDate.now(), LocalDate.now().plusDays(30), 10);

        // Realizar dos compras para el primer cliente
        Customer firstCustomer = purchasingManager.getCustomer("Juan", "Pérez");
        Address deliveryAddress = new Address("Calle Falsa", 123, 35001, "Las Palmas");

        purchasingManager.purchase(LocalDate.now(), firstCustomer, product1, deliveryAddress);
        purchasingManager.purchase(LocalDate.now(), firstCustomer, product2, deliveryAddress);

        // Mostrar los datos de las compras del primer cliente
        System.out.println("Compras de " + firstCustomer.getName()+ " " + firstCustomer.getSurname() + " (" + firstCustomer.getEmail() + "):");
        for (Purchase purchase : purchasingManager.getPurchaseList(firstCustomer)) {
            System.out.println("ID de compra: " + purchase.getId());
            System.out.println("Fecha de compra: " + purchase.getDate());
            System.out.println("Producto: " + purchase.getProduct().getName());
            System.out.println("Categoría: " + purchase.getProduct().getCategory());
            System.out.println("Descripción: " + purchase.getProduct().getDescription());
            System.out.println("Descuento: " + purchase.getProduct().getDiscount()+"%");
            System.out.println("Precio: " + purchase.price()+"€");
            System.out.println("Precio final: " + (purchase.price() - purchase.price() * (purchase.getProduct().getDiscount()/100))+"€");
            System.out.println("Dirección de entrega: " + purchase.getDeliveryAddress().getAddress() + " " + purchase.getDeliveryAddress().getNumber());
            System.out.println("------------------------------------------------");
        }
    }
}
/*
Discount discount = new Discount(LocalDate.now(), LocalDate.now().plusDays(30), 10);
        product1.setDiscount(discount);


if (purchase.getDate().isAfter(product1.discount.getFrom()) && purchase.getDate().isBefore(product1.discount.getTo())) {

}
        */