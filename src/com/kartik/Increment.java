package com.kartik;
public class Increment {
    String name;
    double basic;
    int age;
    public Increment(String name, double basic ,int age){
        this.name= name;
        this.basic= basic;
        this.age= age;
    }
    public void calculate(){
        double inc =0.0;
        if(age>=56)
            inc = basic*20.0/100.0;
        if(age<56&&age>=45)
            inc = basic*15.0/100.0;
        if(age<45)
            inc = basic*10.0/100.0;
        basic = basic +inc;
    }
    public void display(){
        System.out.println("name"+"\t"+"Age"+"\t"+"updated basic");
        System.out.println(name+"\t"+age+"\t"+ basic);
    }
    public static void main(String[] args) {
        Increment mahesh = new Increment("mahesh",50000,34);
        mahesh.calculate();
        mahesh.display();
    }
}
