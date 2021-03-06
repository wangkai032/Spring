package com.gis.beans;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

public class HelloBean implements MessageSourceAware {
	
	private MessageSource _msgSource;
	
	public void HelloWorld(){
		System.out.println(_msgSource.getMessage("HelloMsg", null, Locale.getDefault()));
	}
	

	public void setMessageSource(MessageSource ms){
		_msgSource = ms;
	}
}
