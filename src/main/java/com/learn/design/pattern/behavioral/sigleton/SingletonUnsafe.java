package com.learn.design.pattern.behavioral.sigleton;

public class SingletonUnsafe {
    private static SingletonUnsafe instance;
    private SingletonUnsafe(){}
    public static synchronized SingletonUnsafe getInstance() {
        if (instance == null) {  
            instance = new SingletonUnsafe();
        }  
        return instance;  
    }  
}