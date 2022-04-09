package com.learn.design.pattern.creational.visitor;

public interface ComputerPart {
   public void accept(ComputerPartVisitor computerPartVisitor);
}