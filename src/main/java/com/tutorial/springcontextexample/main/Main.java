package com.tutorial.springcontextexample.main;

import com.tutorial.springcontextexample.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(parrot);
        System.out.println(parrot.getName());
        parrot.setName("Kiki");
        System.out.println(parrot.getName());

//        Parrot parrot = context.getBean("parrot2",Parrot.class);
//        System.out.println(parrot.getName());
//
//        Parrot parrotPrimary = context.getBean(Parrot.class);
//        System.out.println(parrotPrimary.getName());
//
//        Parrot parrot2 = context.getBean("riki",Parrot.class);
//        System.out.println(parrot2.getName());
//
//        String string = context.getBean(String.class);
//        System.out.println(string);

        Integer integer = context.getBean(Integer.class);
        System.out.println(integer);

    }
}
