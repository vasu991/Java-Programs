package com.kartik;

public class Student {
    int id;
    String name;
    //method to display the value of id and name
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){
//creating objects
        Student s1=new Student(1, "vasu");
        Student s2=new Student(2 , "kartik");
//displaying values of the object
        s1.display();
        s2.display();
    }
}
