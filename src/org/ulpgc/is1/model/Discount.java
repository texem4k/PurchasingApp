package org.ulpgc.is1.model;
import java.time.LocalDate;

public class Discount {
    private LocalDate from;
    private LocalDate to;
    private int percentage;

    public Discount(LocalDate from, LocalDate to, int percentage) {
        this.from = from;
        this.to = to;
        this.percentage = percentage;
    }

    public LocalDate getFrom() {
        return this.from;
    }
    public void setFrom(LocalDate from) {
        this.from = from;
    }
    public LocalDate getTo() {
        return this.to;
    }
    public void setTo(LocalDate to) {
        this.to = to;
    }
    public int getPercentage() {
        return this.percentage;
    }
    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        String str = "\t\t\t|- Porcentaje: " + this.percentage + "%\n";
        str += "\t\t\t|- Fecha de inicio: " + this.from + "\n";
        str += "\t\t\t|- Fecha de finalización: " + this.to + "\n";
        return str;
    }
}
