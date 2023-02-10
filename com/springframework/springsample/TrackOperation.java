package com.springframework.springsample;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {
	@Pointcut("execution(* Operaation.*(..))")
	public void k() {}
	
	@Before("k()")
	public void beforeAdvice(JoinPoint jp) {
		System.out.println("additional concern");
	}

}
