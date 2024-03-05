package com.kartik;
import java .util.*;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String  str =  sc.nextLine();
        System.out.println("inverted string: " + palindrome(str));
       if(palindrome(str).equals(str)){
           System.out.println("palindrome word");
       }
       else{
           System.out.println("not a palindrome word");
       }

    }
    public static String  palindrome(String str){
        String str2 = "";
        for(int i = str.length()-1;i>=0;i--){
             str2 = str2 +str.charAt(i);

        }
        return str2;

        }

    }



