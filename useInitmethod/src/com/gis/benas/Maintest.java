package com.gis.benas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Maintest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		HelloBean bean = (HelloBean) context.getBean("HelloBean");
		bean.HelloWorld();
		((AbstractApplicationContext) context).registerShutdownHook();

	}

}
