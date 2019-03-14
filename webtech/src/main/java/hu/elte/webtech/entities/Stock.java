package hu.elte.webtech.entities;

import java.time.LocalDate;

public class Stock {

    private Product product;
    private int amount;
    private double price;
    private LocalDate date;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("Stock [product=%s, amount=%s, price=%s, date=%s]", product, amount, price, date);
    }

}
