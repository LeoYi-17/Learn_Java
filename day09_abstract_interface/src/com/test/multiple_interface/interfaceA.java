package com.test.multiple_interface;

public interface interfaceA {
   public default void method(){
      System.out.println("接口A的默认方法");
   }
}
