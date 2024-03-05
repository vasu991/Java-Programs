package com.kartik;
import java.util.*;
public class Stringop {
    String str;
    String str2 = "";

    public static void main(String[] args) {
        //kartik => mctvkm
        Stringop obj = new Stringop();
        obj.accept();
        obj.encode();
        System.out.println(obj.str2);

    }
    public Stringop(){
        this.str ="";

    }
    public void accept(){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the sentence");
        str = sc.nextLine();

    }
    public void encode(){


         for(int i =0;i<str.length();i++){
             char ch = (char)((int)str.charAt(i)+2);  // a => 97 + 2 = 99 => c
             str2 = str2 + ch;
         }

    }


}