package hu.elte.webtech.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import hu.elte.webtech.entities.Sale;

@Repository
public class SaleRepository {

    private static List<Sale> sales = new ArrayList<>();
    static {
        Sale sale1 = new Sale();
        sale1.setCustomerId(1);
        sale1.setProductId(1);
        sale1.setAmount(12);
        sale1.setDate(LocalDate.now());
        sale1.setPrice(32.32);
        sales.add(sale1);
        
        Sale sale2 = new Sale();
        sale2.setCustomerId(2);
        sale2.setProductId(2);
        sale2.setAmount(5);
        sale2.setDate(LocalDate.now());
        sale2.setPrice(20.95);
        sales.add(sale2);
    }

    public List<Sale> getSales() {
        return sales;
    }

    public void setSales(List<Sale> sales) {
        SaleRepository.sales = sales;
    }
    
    public void addSale(Sale sale){
        sales.add(sale);
    }
    
}
