package hu.elte.webtech.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import hu.elte.webtech.entities.Product;
import hu.elte.webtech.entities.Stock;

@Repository
public class StockRepository {

    private static List<Stock> stock = new ArrayList<>();
    
    static {
        Stock stock1 = new Stock();
        Product tea = new Product();
        tea.setId(1);
        tea.setName("Tea");
        tea.setDescription("Cup of tea");
        stock1.setProduct(tea);
        stock1.setAmount(300);
        stock1.setDate(LocalDate.now());
        stock1.setPrice(3.49);
        stock.add(stock1);
        
        Stock stock2 = new Stock();
        Product iceTea = new Product();
        iceTea.setId(2);
        iceTea.setName("Ice Tea");
        iceTea.setDescription("Cup of ice tea");
        stock2.setProduct(iceTea);
        stock2.setAmount(1000);
        stock2.setDate(LocalDate.now());
        stock2.setPrice(5.99);
        stock.add(stock2);
    }

    public List<Stock> getStock() {
        return stock;
    }

    public void setStock(List<Stock> stock) {
        StockRepository.stock = stock;
    }
    
    public void addStock(Stock stock){
        StockRepository.stock.add(stock);
    }
    
}
