package com.stackroute.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {

        // using ApplicationContext
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        Movie movie1 = (Movie) context.getBean("movieBean", Movie.class);
        Movie movie2 = (Movie) context.getBean("movieBean",Movie.class);
        System.out.println(movie1==movie2);
        Actor actor1=(Actor)context.getBean("actor1");
        Actor actor2=(Actor)context.getBean("actor2");
        Actor actor3=(Actor)context.getBean("actor3");
        System.out.println(actor1);
        System.out.println(actor2);
        System.out.println(actor3);
    }
}
