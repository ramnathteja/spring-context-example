package com.tutorial.springcontextexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.tutorial.springcontextexample.main")
public class ProjectConfig {

//    @Bean
//    @Primary
//    Parrot parrot() {
//        var parrot = new Parrot();
//        parrot.setName("KOKO");
//        return parrot;
//    }
//
//    @Bean
//    Parrot parrot2() {
//        var parrot = new Parrot();
//        parrot.setName("Miki");
//        return parrot;
//    }
//
//    @Bean(name = "riki")
//    Parrot parrot3() {
//        var parrot = new Parrot();
//        parrot.setName("Riki");
//        return parrot;
//    }

    @Bean
    String hello() {
        return "Hello World";
    }

    @Bean
    Integer ten() {
        return 10;
    }
}
