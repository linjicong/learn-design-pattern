package com.learn.design.pattern.behavioral.abstractFactory;

public class Green implements Color {
 
   @Override
   public void fill() {
      System.out.println("Inside Green::fill() method.");
   }
}