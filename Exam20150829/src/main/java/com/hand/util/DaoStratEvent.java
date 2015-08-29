package com.hand.util;

import org.springframework.context.ApplicationEvent;

public class DaoStratEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DaoStratEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	
	public String getBefore(){
		return "Before insert film data!";
	}

}
