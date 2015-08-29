package com.hand.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventConfig {
	
	@Bean
	public Aop aop(){
		return new Aop(BeforeEventPublish到(), daoAfterEventPublish());
	}
	
	@Bean
	public DaoBeforeEventPublish BeforeEventPublish到(){
		return new DaoBeforeEventPublish();
	}
	
	@Bean
	public DaoAfterEventPublish daoAfterEventPublish(){
		return new DaoAfterEventPublish();
	}

}
