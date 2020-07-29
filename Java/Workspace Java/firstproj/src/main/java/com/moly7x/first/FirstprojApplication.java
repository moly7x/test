package com.moly7x.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstprojApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstprojApplication.class, args);
		
		Ailen obj = context.getBean(Ailen.class);
		
		obj.code();
	}

}
