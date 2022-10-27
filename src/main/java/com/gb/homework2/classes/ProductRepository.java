package com.gb.homework2.classes;


import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Component
public class ProductRepository {
    private List<Product> products;

    public ProductRepository(){
        products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public Product getProductById(long idProduct) {
        Product searchProduct = null;
        if (!products.isEmpty()) {
            for (Product product : products) {
                if (product.getId() == idProduct) {
                    searchProduct = product;
                }
            }
        }
        return searchProduct;
    }

    public ProductRepository createRepo() {
        System.out.println("created new repo");
        return new ProductRepository();
    }
}
