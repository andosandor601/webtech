package hu.elte.webtech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.elte.webtech.entities.Customer;
import hu.elte.webtech.entities.Product;
import hu.elte.webtech.entities.Sale;
import hu.elte.webtech.entities.Stock;
import hu.elte.webtech.repository.CustomerRepository;
import hu.elte.webtech.repository.ProductRepository;
import hu.elte.webtech.repository.SaleRepository;
import hu.elte.webtech.repository.StockRepository;

@Service
public class ShoppingService {

    @Autowired
    ProductRepository productRepo;

    @Autowired
    SaleRepository saleRepo;

    @Autowired
    StockRepository stockRepo;

    @Autowired
    CustomerRepository customerRepo;

    public List<Product> getProducts() {
        return productRepo.getProducts();
    }

    public List<Sale> getSales() {
        return saleRepo.getSales();
    }

    public List<Customer> getCustomers() {
        return customerRepo.getCustomers();
    }

    public List<Stock> getStock() {
        return stockRepo.getStock();
    }
}
