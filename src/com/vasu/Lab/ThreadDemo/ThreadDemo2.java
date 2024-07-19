package com.vasu.Lab.ThreadDemo;

public class ThreadDemo2 extends Thread{
    public void run() {
        try {
            System.out.println("Thread 2 Starts...");
            Thread.sleep(2000);
            System.out.println("Thread 2 Ends..");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ThreadDemo2 obj2 = new ThreadDemo2();
        ThreadDemo1 obj1 = new ThreadDemo1(obj2);
        obj1.start();
    }
}
