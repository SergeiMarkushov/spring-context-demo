package com.gb.homework2;

import com.gb.homework2.classes.*;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainHW {
    public static void main(String[] args) {
               ConfigurableApplicationContext context =
                new AnnotationConfigApplicationContext("com.gb.homework2");


        ProductService productService = context.getBean(ProductService.class);
        CartService cartService = context.getBean(CartService.class);
        ProductRepository repo = context.getBean(ProductRepository.class);

        ProductRepository productRepository = repo.createRepo();
        Cart cart = cartService.createNewCart(productRepository);
        System.out.println();
        System.out.println("added products");
        for (int i = 0; i <=5; i++) {
            Product product = productService.createProduct();
            cart.addToCart(product);
        }
        System.out.println();
        System.out.println("get products");

        for (Product product : productRepository.getProducts()) {
            System.out.println(product);
        }

        System.out.println();
        System.out.println("get product by id = 3");

        System.out.println(productRepository.getProductById(3));

        System.out.println();
        System.out.println("delete product by id - 3");

        cart.deleteProductByID(3);

        System.out.println();
        System.out.println("get products without product 3");

        for (Product product : productRepository.getProducts()) {
            System.out.println(product);
        }



    }
}
