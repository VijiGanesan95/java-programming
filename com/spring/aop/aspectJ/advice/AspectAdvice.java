package com.spring.aop.aspectJ.advice;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectAdvice {
	@Pointcut("execution(* com.spring.aop.aspectJ.Operation.printName(..))")
	public void pointcut() {}

	/*
	 * @Before("pointcut()") public void logAdvice(JoinPoint jp) {
	 * System.out.println("inside before advice:"+jp.getSignature().getName()+" "+jp
	 * .getTarget().getClass().toString()+" "+Arrays.toString(jp.getArgs()));
	 * 
	 * }
	 */
	/*
	 * @After("pointcut()") public void logAdvice(JoinPoint jp) {
	 * System.out.println("inside before advice:"+jp.getSignature().getName()+" "+jp
	 * .getTarget().getClass().toString()+" "+Arrays.toString(jp.getArgs()));
	 * 
	 * }
	 */
	@Around("pointcut()")
	public void aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("inside around advice");
		Object obj =pjp.proceed();
	}
}
