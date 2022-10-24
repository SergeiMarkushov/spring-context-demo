package com.gb.spring;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class OrderService {


//    @Autowired //field injection
//    private OrderNameService orderNameService;
//    @Autowired //constructor injection, если конструктор один, то аннотацию ставить необязательно.

    private final OrderNameService orderNameService;

    public OrderService(OrderNameService orderNameService){
        this.orderNameService = orderNameService;
    }


//    // setter injection
//    @Autowired
//    public void setOrderNameService(OrderNameService orderNameService) {
//        this.orderNameService = orderNameService;
//    }

    @PostConstruct
    public void init() {
        System.out.println("Создался бин типа OrderService");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Удалили бин класса OrderService");
    }



    public Order createNewOrder() {
        Order order = new Order();
        order.setName("Заказ номер");
        orderNameService.initName(order);
        return order;
    }
}
