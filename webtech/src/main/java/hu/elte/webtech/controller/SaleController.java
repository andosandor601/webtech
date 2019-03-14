package hu.elte.webtech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.elte.webtech.entities.Sale;
import hu.elte.webtech.service.ShoppingService;

@RestController
public class SaleController {

    @Autowired
    ShoppingService service;
    
    @RequestMapping("/sales")
    List<Sale> home(){
        return service.getSales();
    }
}
