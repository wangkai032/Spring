package com.gis.beans;

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
}
