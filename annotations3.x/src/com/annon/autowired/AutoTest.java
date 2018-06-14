package com.annon.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/annon/autowired/auto-annon-beans.xml");
		Robot robot=context.getBean("robot", Robot.class);
		System.out.println(robot);
	}

}
