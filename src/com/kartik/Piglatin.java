package com.kartik;
import java.util.*;

public class Piglatin {
    static String name;

    public Piglatin() {
        name = "";
    }
    public static boolean isVowel(char c) {
        return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
    public void input() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the sentence:");
        name = sc.nextLine();
    }
    public String pig(String s){
        int len = s.length();
        int index = -1;
        for(int i =0;i<len;i++){
            if(isVowel(s.charAt(i))) {
                index = i;
                break;
            }
        }
        if(index == -1) {
            return " piglatin not possible";
        }

        return s.substring(index) + s.substring(0, index) + "ay";
    }
    public static void main(String[] args) {
        Piglatin obj = new Piglatin();
        obj.input();
        System.out.println(obj.pig(name));
    }
}
