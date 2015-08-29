package com.hand.util;

import org.springframework.context.ApplicationListener;

public class DaoBeforeEventHandler implements ApplicationListener<DaoStratEvent>{

	public void onApplicationEvent(DaoStratEvent event) {
		// TODO Auto-generated method stub
		System.out.println(event.getBefore());
	}

}
