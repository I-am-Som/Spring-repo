package com.learn.spring.SpringProject1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
    	Student stObj = (Student)ctx.getBean("st");
        System.out.println(stObj);
    }
}
