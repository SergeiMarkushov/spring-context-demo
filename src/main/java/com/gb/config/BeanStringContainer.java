package com.gb.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BeanStringContainer {

    @Autowired
    @Qualifier("secondStringBean") //Явно указать какой бин мы хотим инжектить.
    // Если его нет, то будет печататься Primary
    private String bean;

    private String secondStringBean; // можно вставить название бина прям тут

//    public BeanStringContainer(@Qualifier("secondStringBean") String bean) {
//        this.bean = bean;
//    }
//    можно в конструкторе так сделать

    @PostConstruct
    public void init() {
        System.out.println("injected " + bean);
//        System.out.println("injected " + secondStringBean);
    }
}
