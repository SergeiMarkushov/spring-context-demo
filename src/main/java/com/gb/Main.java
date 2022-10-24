package com.gb;

import com.gb.spring.Box;
import com.gb.spring.Order;
import com.gb.spring.OrderNameService;
import com.gb.spring.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //Bean
        // IoC - container Inversion of Control
        // DI - Dependency Injection
        //configuration (xml)-> BeanDefinition -> BeanFactory -> Beans -> application context
        //Bean Definition - описание бина, BeanFactory - создает бины

        AnnotationConfigApplicationContext context =
//        ConfigurableApplicationContext context =
                new AnnotationConfigApplicationContext("com.gb.spring");
//                new AnnotationConfigApplicationContext("com.gb.config");

//        OrderService orderService = context.getBean(OrderService.class);
//        Order order = orderService.createNewOrder();
//        System.out.println(order);
//
//        System.out.println(orderService.createNewOrder());
//        System.out.println(orderService.createNewOrder());
//        System.out.println(orderService.createNewOrder());
//
//        context.close();

        System.out.println(context.getBean(Box.class).getId());
        System.out.println(context.getBean(Box.class).getId());
        System.out.println(context.getBean(Box.class).getId());
        System.out.println(context.getBean(Box.class).getId());
        System.out.println(context.getBean(Box.class).getId());
        System.out.println(context.getBean(Box.class).getId());
        System.out.println(new Box().getId());
        System.out.println(new Box().getId());
        System.out.println(new Box().getId());


//
//        String stringBean =context.getBean(String.class); // можно создать бины любые (LIST!)
//        System.out.println(stringBean);
    }
}
