package com.vasu.Lab.ThreadDemo;

public class ThreadDemo1 extends Thread{
    static ThreadDemo2 obj = null;
    ThreadDemo1(ThreadDemo2 obj) {
        ThreadDemo1.obj = obj;
    }
    public void run() {
        try {
            obj.start();
            obj.join();
            System.out.println("Thread 1 Starts..");
            Thread.sleep(1000);
            System.out.println("Thread 1 Ends...");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
