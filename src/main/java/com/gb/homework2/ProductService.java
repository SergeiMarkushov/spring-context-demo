package com.gb.homework2;

import org.springframework.stereotype.Component;

@Component
public class ProductService {
    private long productId = 1l;

    public Product createNewProduct() {
        Product product = new Product();
        product.setId(productId++);
        product.setTitle("Продукт" + productId);
        product.setCost((long)(Math.random()*10000));
        return product;
    }

    public Product createNewProduct(long id, String title, long cost) {
        Product product = new Product();
        product.setId(id);
        product.setTitle(title);
        product.setCost(cost);
        return product;
    }
}
