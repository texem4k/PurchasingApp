package org.ulpgc.is1.model;
import java.time.LocalDate;


public class Payment {

    private LocalDate date;
    private int amount;
    private String card;

    public Payment(LocalDate date, int amount, String card) {
        this.date = date;
        this.amount = amount;
        this.card = card;
    }

    public LocalDate getDate() {
        return this.date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public int getAmount() {
        return this.amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public String getCard() {
        return this.card;
    }
    public void setCard(String card) {
        this.card = card;
    }

    @Override
    public String toString() {
        String str = "\t\t\t|- Tarjeta de pago: " + this.card + "\n";
        str += "\t\t\t|- Cantidad: " + this.amount + " euros\n";
        str += "\t\t\t|- Fecha del pago: " + this.date.toString() + "\n";
        return str;
    }
}
