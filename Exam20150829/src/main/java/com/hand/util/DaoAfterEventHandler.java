package com.hand.util;

import org.springframework.context.ApplicationListener;

public class DaoAfterEventHandler implements ApplicationListener<DaoStopEvent> {

	public void onApplicationEvent(DaoStopEvent event) {
		// TODO Auto-generated method stub
		System.out.println(event.getAfter());
	}

}
