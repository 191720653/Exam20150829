package com.hand.util;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class DaoAfterEventPublish implements ApplicationEventPublisherAware {
	
	private ApplicationEventPublisher publisher;

	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}

	public void publish() {
		DaoStopEvent daoStopEvent = new DaoStopEvent(this);
		publisher.publishEvent(daoStopEvent);
	}
}