package com.gb;

import com.gb.config.BeanStringContainer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class JavaConfigMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.gb.config");

//        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        Arrays.stream(beanDefinitionNames).forEach(System.out::println);
//
//        Object first = context.getBean("first"); // по id в аннотации
//        System.out.println(first);
//
//        Object secondStringBean = context.getBean("secondStringBean"); // по id имя метода
//        System.out.println(secondStringBean);

//        String stringBean = context.getBean(String.class);
//        System.out.println(stringBean);

//        BeanStringContainer bean = context.getBean(BeanStringContainer.class);

    }
}
