package com.learn.design.pattern.creational.observer;

public abstract class Observer {
   protected Subject subject;
   public abstract void update();
}