package com.hand.util;

import org.aspectj.lang.ProceedingJoinPoint;

public class Aop {
	
	private DaoBeforeEventPublish daoBeforeEventPublish;
	private DaoAfterEventPublish daoAfterEventPublish;

	public DaoBeforeEventPublish getDaoBeforeEventPublish() {
		return daoBeforeEventPublish;
	}

	public void setDaoBeforeEventPublish(DaoBeforeEventPublish daoBeforeEventPublish) {
		this.daoBeforeEventPublish = daoBeforeEventPublish;
	}

	public DaoAfterEventPublish getDaoAfterEventPublish() {
		return daoAfterEventPublish;
	}

	public void setDaoAfterEventPublish(DaoAfterEventPublish daoAfterEventPublish) {
		this.daoAfterEventPublish = daoAfterEventPublish;
	}
	
	public Aop(){}
	
	public Aop(DaoBeforeEventPublish daoBeforeEventPublish,DaoAfterEventPublish daoAfterEventPublish){
		this.daoBeforeEventPublish = daoBeforeEventPublish;
		this.daoAfterEventPublish = daoAfterEventPublish;
	}

	public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
//		System.out.println("Before " + pjp.getSignature().getName() + "()..........");
		daoBeforeEventPublish.publish();
		Object retVal = pjp.proceed();
		daoAfterEventPublish.publish();
//		System.out.println("After " + pjp.getSignature().getName() + "()..........");
		return retVal;
	}

}
