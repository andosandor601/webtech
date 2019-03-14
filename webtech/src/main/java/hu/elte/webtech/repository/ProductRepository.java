package hu.elte.webtech.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import hu.elte.webtech.entities.Product;

@Repository
public class ProductRepository {

    private static List<Product> products = new ArrayList<>();
    
    static {
        Product tea = new Product();
        tea.setId(1);
        tea.setName("Tea");
        tea.setDescription("Cup of tea");
        products.add(tea);
        
        Product iceTea = new Product();
        iceTea.setId(2);
        iceTea.setName("Ice Tea");
        iceTea.setDescription("Cup of ice tea");
        products.add(iceTea);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        ProductRepository.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product findProductById(long id) {
        return products.stream().filter(product -> product.getId() == id).findFirst().get();
    }
}
