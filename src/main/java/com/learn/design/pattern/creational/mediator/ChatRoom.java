package com.learn.design.pattern.creational.mediator;

import java.util.Date;
 
public class ChatRoom {
   public static void showMessage(User user, String message){
      System.out.println(new Date().toString()+ " [" + user.getName() +"] : " + message);
   }
}