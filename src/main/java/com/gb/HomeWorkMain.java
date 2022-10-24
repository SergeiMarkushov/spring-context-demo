package com.gb;

import com.gb.homework2.Cart;
import com.gb.homework2.Product;
import com.gb.homework2.ProductRepository;
import com.gb.homework2.ProductService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HomeWorkMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.gb.homework2");

//        System.out.println(context.getBean(Cart.class)); // Корзина # 1 созданa
        Cart cart = context.getBean(Cart.class);
        cart.addProduct();
        ProductService ps = context.getBean(ProductService.class);
        Product newProduct = ps.createNewProduct();
        ProductRepository repo = context.getBean(ProductRepository.class);
        repo.addNewProduct(newProduct);
        System.out.println(repo.getProductList());


    }
}
