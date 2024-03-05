package com.kartik;
import java .util.*;

public class FrequencyOffThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence:");
        String str = sc.nextLine();
        System.out.println("frequency of the: "+frequency(str));

    }
    public static int frequency(String s){
        int freq = 0;
        String word ="";
        s = s + " ";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch!=' '){
                word = word + ch;
            }
            else {
                if(word.compareToIgnoreCase("the")==0) {
                    freq++;
                }
                word = "";
            }


        }

        return freq;

    }
}
