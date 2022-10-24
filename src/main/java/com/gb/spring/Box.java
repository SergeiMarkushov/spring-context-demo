package com.gb.spring;

import lombok.Getter;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;


@Component
//@Scope("singleton") // по умолчанию синглтон
//@Scope("prototype") // создает новые обьекты, бины scop не храняться в контексте
//@Scope session для веб приложения, создает бин и живет пока жива http сессия
//@Scope request жив пока живет http запрос.
//@Lazy // спринг создаст бин когда мы потребуем, а если не потребуем то он его никогда не создаст
//@Service нужны для логического деления бинов на разделы.
//@Repository
//dao взаимодействие с бд
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // лучше писать вот так

public class Box {
   private static long id_sequence = 1L;

   @Getter
   private final long id;

   public Box() {
       this.id = id_sequence++;
   }

   @PostConstruct
   public void init() {
      System.out.println("Box # " + id + " создан");
   }


}
