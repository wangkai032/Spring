package com.gis.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainTest1 {
	public static void main(String[] args) {
		BeanDefinitionRegistry reg = new DefaultListableBeanFactory();
		PropertiesBeanDefinitionReader reader = new PropertiesBeanDefinitionReader(reg);
		reader.loadBeanDefinitions(new ClassPathResource("beans.properties"));
		//Ū��Beans �պA��
//		Resource rs = new ClassPathResource("beans.config.xml");
		//�إ�Bean Factory, �o�O�ΨӲ���Bean������骺�u�t
//		BeanFactory factory = new XmlBeanFactory(rs);
		BeanFactory factory = (BeanFactory) reg;
		//�Hid�VFactory�n�D�@��Bean
		HelloBean bean = (HelloBean) factory.getBean("HelloBean");
		bean.HelloWorld();

	}
}