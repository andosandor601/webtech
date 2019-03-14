package hu.elte.webtech.service;

import java.time.LocalDate;

public class SaleDto {

    private long productId;
    private long customerId;
    private int amount;
    private double price;
    private LocalDate date;

    public SaleDto() {
    }

    public SaleDto(long productId, long customerId, int amount, double price, LocalDate date) {
        super();
        this.productId = productId;
        this.customerId = customerId;
        this.amount = amount;
        this.price = price;
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("SaleDto [productId=%s, customerId=%s, amount=%s, price=%s, date=%s]", productId, customerId, amount, price, date);
    }

}
