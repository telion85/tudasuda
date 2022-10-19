package site.telion.tudasuda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.telion.tudasuda.service.ProductService;

@RestController
@RequestMapping("/product")

public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping("/add")
    public String add() {
        return service.addProduct("товар1");
    }
}
