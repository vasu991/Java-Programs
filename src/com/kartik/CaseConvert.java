package com.kartik;
import java .util.*;


public class CaseConvert {
    String str;

    public static void main(String[] args) {
        CaseConvert o = new CaseConvert();
        o.getstr();
        o.convert();
        o.display();

    }
    public void getstr(){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the string");
        this.str=sc.nextLine();
    }
    public String convert(){
        String str2 = "";
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(65<=ch && 90>=ch){
                str2 = str2 + String.valueOf(ch).toLowerCase();
            }
            if(97<=ch && 122>=ch){
                str2 = str2 + String.valueOf(ch).toUpperCase();
            }
        }
        return str2;
    }
    public void display(){
        System.out.println(convert());
    }

}
