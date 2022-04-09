package com.learn.design.pattern.behavioral.abstractFactory;

import com.learn.design.pattern.behavioral.factory.Circle;
import com.learn.design.pattern.behavioral.factory.Rectangle;
import com.learn.design.pattern.behavioral.factory.Shape;
import com.learn.design.pattern.behavioral.factory.Square;

public class ShapeFactory extends AbstractFactory {
    
   @Override
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }        
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();
      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
      } else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }
      return null;
   }
   
   @Override
   public Color getColor(String color) {
      return null;
   }
}