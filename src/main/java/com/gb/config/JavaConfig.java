package com.gb.config;

import com.gb.spring.OrderNameService;
import com.gb.spring.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class JavaConfig {

    @Bean
    public OrderService orderService(OrderNameService orderNameService) {
        OrderService orderService = new OrderService(orderNameService);
//        orderService.setOrderNameService(); // setter injection
        // если fieldInjection спринг делает сам.
        return orderService;
    }

    @Bean
    public OrderNameService orderNameService() {
        return new OrderNameService();
    }

    @Bean("first") //указать id можно явно
    @Primary // устанавливает приоритет бинов, может быть только один
    public String firstStringBean() { // имя бина id это имя метода
        return "I'm first string bean";
    }
    @Bean // если имя явно не указано то берется название метода
    public String secondStringBean() {
        return "I'm second string bean";
    }

}
