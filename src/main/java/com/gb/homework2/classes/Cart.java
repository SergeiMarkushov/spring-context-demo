package com.gb.homework2.classes;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class Cart {

    @Autowired
    private ProductRepository productRepository;

    public Cart(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addToCart(Product product) {
        productRepository.getProducts().add(product);
    }

    public void deleteProductByID(long idProduct) {
        productRepository.getProducts().removeIf(product -> product.getId() == idProduct);
    }


}
