package com.gb.homework2.classes;

import org.springframework.stereotype.Component;

@Component
public class ProductInstanceService {

    private static long id = 1L;

    public void initInstance(Product product) {
        product.setId(id++);
        product.setTitle("TitleProduct #" + product.getId());
        product.setCost((long) (Math.random()*1000));
    }

}
