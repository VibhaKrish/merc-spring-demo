package com.merc.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

import com.merc.demo.models.Employee;

@ComponentScan
public class AnnotApp {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AnnotApp.class);
		Employee emp = context.getBean(Employee.class);
		System.out.println(emp.toString());

		((AbstractApplicationContext) context).close();

	}

}