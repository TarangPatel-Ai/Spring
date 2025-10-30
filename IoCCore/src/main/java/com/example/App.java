package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        Airtal airtal = ac.getBean(Airtal.class);
        airtal.typeOfSim();
        airtal.networkType();
        System.out.println(airtal.getSignal());
    	//Airtal airtal =(Airtal) ac.getBean("airtal");
    	
        
        Idea idea = ac.getBean(Idea.class);
        idea.typeOfSim();
        idea.networkType();
        System.out.println(idea.getSignal());
    }
}
