package com.learn.design.pattern.j2ee.interceptingFilter;

public class Target {
   public void execute(String request){
      System.out.println("Executing request: " + request);
   }
}