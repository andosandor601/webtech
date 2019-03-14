package hu.elte.webtech.entities;

import java.time.LocalDate;

public class Sale {

    private long productId;
    private long customerId;
    private int amount;
    private double price;
    private LocalDate date;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
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
        return String.format("Sale [productId=%s, customerId=%s, amount=%s, price=%s, date=%s]", productId, customerId, amount, price, date);
    }

}
