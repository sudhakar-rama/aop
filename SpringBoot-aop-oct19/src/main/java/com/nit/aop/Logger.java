package com.nit.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
@Component
public class Logger {
     
	@Before(value= "excution(* com.nit.service.*.*(..))")
	public void beforeExecting(JoinPoint JoinPoint) {
		    log.info("During @Before execution....{},{}",JoinPoint.toShortString(), JoinPoint.getArgs().length);
	}
	
	@After(value = "excution(* com.nit.service.*.*(..))")
	public void afterExcuting(JoinPoint jointPoint) {
		log.info("During @After excution ....{}",jointPoint.toShortString());
	}
	
	@Around(value ="execution(* com.nit.service.*.*(..))")
	public void around123(ProceedingJoinPoint joinpoint) throws Throwable {
		log.info("During @Around begin ....{}");
		joinpoint.proceed();
		log.info("During @Around end ....{}");
	}
	
	@AfterThrowing(value = "execution(* com.nit.service.*.*(..))", throwing = "ex")
	public void afterExecuting123(Exception ex) {
		log.info("During @AfterThrowing execution  ....{}",ex.getMessage());
	}
	
}
