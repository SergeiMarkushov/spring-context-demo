package com.gb.homework2.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CartService {
    @Autowired
    ProductRepository productRepository;

    public Cart createNewCart(ProductRepository productRepository) {
        System.out.println("created new cart");
        return new Cart(productRepository);
    }
}

