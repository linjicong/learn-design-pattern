package com.learn.design.pattern.behavioral.sigleton;

public class SingletonStaticAdvance {

    private static class SingletonHolder {
        private static final SingletonStaticAdvance INSTANCE = new SingletonStaticAdvance();
    }
    private SingletonStaticAdvance (){}
    public static final SingletonStaticAdvance getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
