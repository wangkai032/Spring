package com.gis.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest1 {
	public static void main(String[] args) {
		//���oconfig.xml
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		//�HID�VApplicationContext���@��bean
		toMessage bean = (toMessage) context.getBean("toMessage");
		bean.setMsg("Hello 1");
		bean.Message();
		//�ϥ�scope���ͷs��bean����
		toMessage bean2= (toMessage) context.getBean("toMessage");
		bean2.setMsg("Hello scope ");
		bean2.Message();

	}
}