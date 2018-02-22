package com.aop;

import org.aspectj.lang.annotation.Pointcut;

public class SpellChecker {
   public SpellChecker() {
	      System.out.println("Inside SpellChecker constructor." );
   }
   
   @Pointcut("execution(public * checkSpelling())")
   public void checkSpelling() {
      System.out.println("Inside checkSpelling." );
   }
}
