package com.kartik;
import java.util.*;
public class FrequencyOfThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        String[] f = StringFun.fun(s);
        int ctr =0;
        for (String value : f) {
            if (value.equals("the")) {
                ctr++;
            }
        }
        System.out.println("Frequency of the:"+ctr);


    }
}