package com.kartik;
import java.util.*;

public class AmericanName {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        System.out.println("enter the sentence:");
        String str = sc.nextLine();
        System.out.println(inverted(str));
    }
    public static String inverted(String str){
        String rev;
        int i;
        for(i = str.length()-1; i>=0; i--) {
            if(str.charAt(i) == ' ') {
                break;
            }
        }
        rev = str.substring(i+1);
        rev = rev + ", " + str.substring(0, i);
        return rev;
    }
}
