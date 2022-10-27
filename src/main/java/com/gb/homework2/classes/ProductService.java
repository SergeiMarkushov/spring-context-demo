package com.gb.homework2.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
    private static long id = 1L;

    @Autowired
    private ProductInstanceService productInstanceService;

    public Product createProduct() {
        Product product = new Product();
        productInstanceService.initInstance(product);
        return product;
    }

}
