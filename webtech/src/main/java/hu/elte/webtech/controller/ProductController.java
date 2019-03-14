package hu.elte.webtech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.elte.webtech.entities.Product;
import hu.elte.webtech.service.ShoppingService;

@RestController
public class ProductController {
    
    @Autowired
    ShoppingService service;
    
    @RequestMapping("/products")
    List<Product> home(){
        return service.getProducts();
    }

}
