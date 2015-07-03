package com.gis.benas;

public class HelloBean {
	private String _msg;
	
	public String getMsg(){
		return _msg;
	}
	
	public void setMsg(String val){
		_msg = val;
	}
	
	public void HelloWorld(){
		System.out.println(_msg);
	}
	
	public HelloBean(){
		
	}
	
	public void BeanInit(){
		System.out.println("bean init method is call");
	}
}
