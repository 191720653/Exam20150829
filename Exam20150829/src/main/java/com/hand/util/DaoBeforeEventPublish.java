package com.hand.util;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class DaoBeforeEventPublish implements ApplicationEventPublisherAware {
	
	private ApplicationEventPublisher publisher;

	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}

	public void publish() {
		DaoStratEvent daoStratEvent = new DaoStratEvent(this);
		publisher.publishEvent(daoStratEvent);
	}
}