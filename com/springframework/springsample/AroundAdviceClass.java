package com.springframework.springsample;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class AroundAdviceClass implements org.aopalliance.intercept.MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println(invocation.getMethod());
		//System.out.println(invocation.getArguments());
		//System.out.println("before AroundAdviceClass : jointpoint");
		System.out.println("********************before AroundAdviceClass : jointpoint***************");
		try {
			Object obj = invocation.proceed();
			System.out.println("**************after AroundAdviceClass : jointpoint*************");
			//System.out.println("after AroundAdviceClass : jointpoint");
			return obj;
		}catch(Exception e) {
			throw e;
		}
	}

	

}
