package com.vasu.Lab;

public class AnonymousInnerClass {
    public void engine() {
        System.out.println("Main Engine...");
    }
    public static void main(String[] args) {
        AnonymousInnerClass obj1 = new AnonymousInnerClass() {
          public void engine() {
              System.out.println("Secondary Engine..");
          }
        };
        obj1.engine();
        System.out.println(obj1.getClass().getName());
    }
}
