package com.study.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class LogAop {
	
	@Pointcut("within(com.study.spring.*)")
	private void pointcutMethod() {
		System.out.println("pointcut");
	}
	@Around("pointcutMethod()")
	public Object loggerAop(ProceedingJoinPoint joinPoint)  throws Throwable
	{
		String signatureStr = joinPoint.getSignature().toShortString();
		System.out.println(signatureStr + "is start!!!!!!!!!!!!!!!");
		
		long st = System.currentTimeMillis();
		
		try {
			
			Object obj = joinPoint.proceed();
			return obj;
		} finally{
			long et = System.currentTimeMillis();
			
			System.out.println(signatureStr + " is finished!!!!!!!!!!!!!!!!");
			System.out.println(signatureStr + "경과시간 : " + (et - st));
		}
	}
	@Before("within(com.study.spring.*)")
	public void beforeAdvice() {
		System.out.println("beforeAdvice()");
	}
	
	public void afterReturningAdvice() {
		System.out.println("afterReturningAdvice()");
	}
	
	public void afterThrowingAdvice() {
		System.out.println("afterThrowingAdcive()");
	}
	@After("within(com.study.spring.*)")
	public void afterAdvice() {
		System.out.println("afterAdvice()");
	}


}
