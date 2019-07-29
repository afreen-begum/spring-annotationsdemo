package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages="com.stackroute.domain")
public class BeanConfiguration {

@Bean
    public Actor actor1() {
    Actor actor1 = new Actor("Arjun","male",30);
    return actor1;

    }
    @Bean
    public Actor actor2() {
    Actor actor2 = new Actor("Rani","Female",32);
    return actor2;
    }
    @Bean
    public Actor actor3() {
    Actor actor3 = new Actor("Shakti","Male",37);
    return actor3;
    }




}

