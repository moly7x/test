package com.telusko.demoproj;

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
//        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
    	
    	ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
    	
        Ailen obj = (Ailen) factory.getBean("ailen");
    	
    	obj.code();
    	
    	System.out.println(obj.getAge());
    	
    	((ClassPathXmlApplicationContext) factory).close();
    }
}
