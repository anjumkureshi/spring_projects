package com.indianrailways;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainClass 
{
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		
		context.register(JPAConfig.class);
		context.refresh();
		
//		TrainsInfoService sourceSer=context.getBean(TrainsInfoService.class);
//		System.out.println(sourceSer);

		

	}


}
