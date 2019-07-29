package com.stackroute.domain;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;


public class AppConfig {
    @Bean(name = "actor1")
    public Actor getActor1(){

        Actor actor1 = new Actor("Shakti","male",30);
        return actor1;
    }


    @Bean(name = "movie1")
    @Scope("prototype")
    public Movie getMovie1(){
        Movie movie1 = new Movie();

        return movie1;
    }

}
