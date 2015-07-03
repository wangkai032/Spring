package com.gis.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("HelloBean")
@Scope("prototype")
public class HelloBean {
	
	private String _msg;
	
	public String getMsg(){
		return _msg;
	}
	
	public void setMsg(String value){
		_msg = value;
	}
	
	public void HelloWorld(){
		System.out.println(_msg);
	}
	
	public HelloBean(){
		
	}
}
