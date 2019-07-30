package com.stackroute.domain;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @PostConstruct
    public void customInit(){

        System.out.println("running customInit method");
    }

    @PreDestroy
    public void customDestroy(){

        System.out.println("running customDestroy method");

    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("This method runs after all bean properties are set");

    }

    @Override
    public void destroy() throws Exception {

        System.out.println("This method runs after Spring container is released the bean");


    }
}
