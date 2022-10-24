package com.gb.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class OrderNameService {

    private static long orderSequence = 1L;

    public void initName(Order order){
        order.setName("Заказ №" + orderSequence++);
    }

    @PostConstruct
    public void init() {
        System.out.println("Создался бин типа OrderNameService");
    }

}
