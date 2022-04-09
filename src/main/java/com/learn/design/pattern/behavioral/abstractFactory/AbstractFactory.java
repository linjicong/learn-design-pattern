package com.learn.design.pattern.behavioral.abstractFactory;

import com.learn.design.pattern.behavioral.factory.Shape;

public abstract class AbstractFactory {
   public abstract Color getColor(String color);
   public abstract Shape getShape(String shape);
}