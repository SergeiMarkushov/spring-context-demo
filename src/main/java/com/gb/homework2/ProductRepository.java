package com.gb.homework2;


import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
@Data
public class ProductRepository {
    private ProductService productService;
    private Product product;
    private List<Product> products = new ArrayList<>();

    public void addProducts () {
        for (int i = 0; i <=5 ; i++) {
            products.add(productService.createNewProduct());
        }
    }

    public List<Product> getProductList() {
        return products;
    }

    public Product getProductById(int productId) {
        Product returnProduct = null;
        for (Product product1 : products) {
            if (product1.getId() == productId) {
                returnProduct = product1;
            }
        }
        return returnProduct;
    }

    public void addNewProduct(Product product) {
        products.add(product);
    }

}
