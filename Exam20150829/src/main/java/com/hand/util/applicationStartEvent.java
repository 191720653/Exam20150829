package com.hand.util;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class applicationStartEvent implements ApplicationListener<ContextStartedEvent> {

	public void onApplicationEvent(ContextStartedEvent event) {
		// TODO Auto-generated method stub
		System.out.println("-----ContextStarted-----");
	}
}