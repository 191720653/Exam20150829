package com.hand.util;

import org.springframework.context.ApplicationEvent;

public class DaoStopEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DaoStopEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	
	public String getAfter(){
		return "After insert film data!";
	}

}
