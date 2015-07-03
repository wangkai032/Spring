package com.gis.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MeanTest2 {

	public static void main(String[] args) {
		Resource rs = new ClassPathResource("beans.config2.xml");
		BeanFactory factory = new XmlBeanFactory(rs);
		LogBean bean = (LogBean) factory.getBean("LogBean");
		bean.Log("HelloWorld");

	}

}
