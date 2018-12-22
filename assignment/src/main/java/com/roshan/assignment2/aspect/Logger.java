package com.roshan.assignment2.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class Logger {

	@Before("execution(public void com.roshan.assignment1.*.getCustomerData())")
	public void loggerAdvice(){
		System.out.println("Before Logger executed");
	}
	
	
	@AfterReturning("execution(public void com.roshan.assignment1.*.getCustomerData())")
	public void secondAdvice(){
		System.out.println("Returning Advice executed");
	}
	
	@AfterThrowing(pointcut = "execution(public void com.roshan.assignment1.*.getCustomerData())" , throwing ="error")
	public void thirdAdvice(JoinPoint jp , NullPointerException error){
		System.out.println("Throwing Advice executed" );
		System.out.println("Exception" + error);
		System.out.println(jp.getSignature());
		System.out.println(jp.getTarget());
		System.out.println(jp.toString());
	}
	
	@After("execution(public void com.roshan.assignment1.*.getCustomerData())")
	public void fourthAdvice(){
		System.out.println("After Advice executed");
	}
	
	@Around("execution(public void com.roshan.assignment1.*.getCustomerData())")
	public void fifthAdvice(ProceedingJoinPoint pjp){
		System.out.println("Around before");
		try {
			pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("Around after Advice executed");
	}
}
