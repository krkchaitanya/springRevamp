package com.springQualifiers;

import com.springQualifiers.mobiles.Micromax;
import com.springQualifiers.mobiles.OnePlus;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainQualifier {
    public static void main(String[] args) {
//        Field Injection
//        Calling the services from cellphone classes using field and qualifier annotations.
//        @Qualifier annotations is used to specify the services that we are calling.

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        OnePlus onePlus = (OnePlus) ctx.getBean("onePlus");
        Micromax micromax = (Micromax) ctx.getBean("micromax");

        System.out.println("----------------");
        System.out.println(onePlus.getCompanyInfo());
        System.out.println(micromax.getCompanyInfo());
        System.out.println("----------------");


        ctx.close();
    }
}
