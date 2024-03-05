package com.kartik;


public class Security {
    String n;
    int h;
    double r,w;

    public Security(String name,int hour,double rate){
        n = name;
        h = hour;
        r = rate;


    }
    public void calwage(){
        if(h<=40)
            w = r*40.0;
        if(h>40 && h<=60)
            w= (h-40)*1.5*r+40*r;
        if(h>60&&h<=80)
            w=(h-60)*2*r+20*1.5*r+40*r;
    }
    public void display() {
        System.out.println("name"+ "\t"+"hours"+"\t"+"wage in Rs");
        System.out.println(n+"\t"+ h + "\t"+w);

    }

    public static void main(String[] args) {
        Security mahesh = new Security("mahesh", 69,22 );
        mahesh.calwage();
        mahesh.display();
    }

}
