package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

//	//@Before advice
//	@Before("execution(* com.example.demo.service.*.*(..))")
//	public void beforeAdvice() {
//		System.out.println("Before method execution");
//	}
//
//	//@After advice
//	@After("execution(* com.example.demo.service.*.*(..))")
//	public void afterAdvice() {
//		System.out.println("After method execution");
//	}
////
//	//Around Advice
	@Around("execution(* com.example.demo.service.*.*(..))")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("Before proceeding the method: " + joinPoint.getSignature());
		Object result = joinPoint.proceed();
		System.out.println("After proceeding the method: " + joinPoint.getSignature());
		return result;
	}

	// After Returning Advice
//	@AfterReturning(pointcut = "execution(* com.example.demo.service.*.*(..))", returning = "result")
//	public void afterReturningAdvice(JoinPoint joinPoint, Object result) {
//		System.out.println("Method Success: " + joinPoint.getSignature());
//		System.out.println("Returned: " + result);
//	}

//	 After Throwing Advice
//	@AfterThrowing(pointcut = "execution(* com.example.demo.service.*.*(..))", throwing = "ex")
//	public void afterThrowingAdvice(JoinPoint joinPoint, Throwable ex) {
//		System.out.println("❌ Error in: " + joinPoint.getSignature());
//		System.out.println("Error: " + ex.getMessage());
//	}
}
