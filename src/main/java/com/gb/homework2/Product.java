package com.gb.homework2;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Product {
    private long id;
    private String title;
    private long cost;


}
