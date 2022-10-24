package com.gb.homework2;

import lombok.Getter;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Cart {
    private ProductRepository productRepository;
    private ProductService productService;
    private static long cartID = 1L;

    @Getter
    private final long id;

    public Cart() {
        this.id = cartID++;
    }

    @PostConstruct
    public void init() {
        System.out.println("Корзина # " + id + " созданa");
    }

    public void addProduct() {
        productRepository.addNewProduct(productService.createNewProduct());
    }
    public void deleteProductById(long id) {
        List<Product> productList = productRepository.getProductList();
        productList.removeIf(product -> product.getId() == id);
    }
}
