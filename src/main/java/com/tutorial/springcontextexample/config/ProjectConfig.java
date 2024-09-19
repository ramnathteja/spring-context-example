package com.tutorial.springcontextexample.config;

import com.tutorial.springcontextexample.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    @Primary
    Parrot parrot() {
        var parrot = new Parrot();
        parrot.setName("KOKO");
        return parrot;
    }

    @Bean
    Parrot parrot2() {
        var parrot = new Parrot();
        parrot.setName("Miki");
        return parrot;
    }

    @Bean(name = "riki")
    Parrot parrot3() {
        var parrot = new Parrot();
        parrot.setName("Riki");
        return parrot;
    }

    @Bean
    String hello() {
        return "Hello World";
    }

    @Bean
    Integer ten() {
        return 10;
    }
}
