package hu.elte.webtech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.elte.webtech.entities.Stock;
import hu.elte.webtech.service.ShoppingService;

@RestController
public class StockController {

    @Autowired
    ShoppingService service;

    @RequestMapping("/stock")
    List<Stock> home() {
        return service.getStock();
    }
}
