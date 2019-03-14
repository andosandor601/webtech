package hu.elte.webtech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.elte.webtech.entities.Customer;
import hu.elte.webtech.service.ShoppingService;

@RestController
public class CustomerController {

    @Autowired
    ShoppingService service;
    
    @RequestMapping("/customers")
    List<Customer> home(){
        return service.getCustomers();
    }
}
