package com.learn.design.pattern.behavioral.sigleton;

public class SingletonStatic {
    private static SingletonStatic instance = new SingletonStatic();
    private SingletonStatic (){}
    public static SingletonStatic getInstance() {
        return instance;
    }
}
