package com.gis.beans;

import java.util.Date;

public class HelloBean {
	
	private String _msg;
	
	public void setMsg(String value){
		_msg = value;
	}
	
	public String getMsg(){
		return _msg;
	}
	
	public void HelloWorld(){
		System.out.println(_msg);
	}
	
	public static HelloBean InitWithDate(){
		HelloBean b = new HelloBean();
		b.setMsg(new Date().toString());
		return b;
	}
	

	
}
