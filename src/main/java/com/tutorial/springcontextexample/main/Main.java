package com.tutorial.springcontextexample.main;

import com.tutorial.springcontextexample.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = new Parrot();
//        p.setName("Kiki");
        p.setName("Miki");

        Puppy puppy = new Puppy();
        puppy.setName("Kyoto");

        Supplier<Parrot> parrotSupplier = () -> p;
        Supplier<Puppy> puppySupplier = () -> puppy;

        context.registerBean("Parrot1", Parrot.class, parrotSupplier);

        if(p.getName().equals("Kiki")) {
            Parrot parrot = context.getBean(Parrot.class);
            System.out.println(parrot.getName());
        } else {
            context.registerBean("Puppy1", Puppy.class, puppySupplier);
            Puppy goodBoy = context.getBean(Puppy.class);
            System.out.println(goodBoy.getName());
        }
    }
}
