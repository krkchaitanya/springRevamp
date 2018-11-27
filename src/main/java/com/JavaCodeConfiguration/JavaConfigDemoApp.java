package com.JavaCodeConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
        //    Read spring config Java class
        AnnotationConfigApplicationContext ctxt = new AnnotationConfigApplicationContext(Sportconfig.class);


        ctxt.close();
    }
}
