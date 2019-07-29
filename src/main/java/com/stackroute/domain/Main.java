package com.stackroute.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {

        // using ApplicationContext
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        Movie movie1 = (Movie) context.getBean("movieBean", Movie.class);
        System.out.println(movie1);


    }
}
