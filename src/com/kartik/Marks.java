package com.kartik;

import java.util.*;

public class Marks {
    String name;
    int age,m1,m2,m3,max;
    float avg;

    public Marks(String name, int age, int m1, int m2, int m3 ) {
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.age = age;
    }
    public void compute(){
        avg = (float)(m1+m2+m3)/3;
        if(m1>m2&&m1>m3)
            max = m1;
        if(m2>m1&&m2>m3)
            max = m2;
        if(m3>m1&&m3>m2)
            max= m3;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age:" + age);
        System.out.println("marks in three subjects: "+ m1 +" "+ m2 + " "+ m3);
        System.out.println("the highest mark in three subjects: "+ max);
        System.out.println("the average marks: "+ avg);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nm;
        int ag,a1,b1,c1;
        System.out.println("enter student's name,age,marks in three subjects one by one");
        nm = sc.nextLine();
        ag = sc.nextInt();
        a1= sc.nextInt();
        b1 = sc.nextInt();
        c1 = sc.nextInt();
        Marks obj = new Marks(nm,ag,a1,b1,c1);
        obj.compute();
        obj.display();
    }
}
