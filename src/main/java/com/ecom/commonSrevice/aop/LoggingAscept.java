package com.ecom.commonSrevice.aop;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAscept {

  private  static final  Logger log = LogManager.getLogger(LoggingAscept.class);

  @Pointcut("execution(* com.ecom..controller..*(..))")
  public void controllerMethod(){

  }

  @Before("controllerMethod")
  public void entryLog(){

  }

  @After("controllerMethod")
  public void afterLog(){

  }
  @Pointcut("execution(* com.ecom..*(..))")
  public void exceptionMethod(){

  }
  @AfterThrowing(pointcut ="exceptionMethod",throwing = "ex")
  public void runTimException(JoinPoint jp){
    log.info("exception occured" + jp.getSignature() );
  }
}
