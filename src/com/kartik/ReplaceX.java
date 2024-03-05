package com.kartik;
import java.util.*;

public class ReplaceX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence");
        String x = sc.nextLine();
        System.out.println(replace(x));
    }
    public static StringBuilder replace(String x){
        StringBuilder str = new StringBuilder();
        x = " " + x;
        for(int i = 0;i<x.length();i++){
            char ch = x.charAt(i);
            if(ch == ' '){
                str.append(" X");
                i++;
            }
            else {
                str.append(ch);
            }
        }
        return str;

    }
}
