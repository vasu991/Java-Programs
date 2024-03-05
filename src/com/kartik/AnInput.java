package com.kartik;
import java.util.*;

public class AnInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the sentence:");
        String  str  = sc.nextLine();
        str.toUpperCase();
        char[] origanal = new char[str.length()];
        char[] changed = new char[100];
        for(int i = 0; i<origanal.length; i++) {
            origanal[i] = str.charAt(i);
        }
        int k = 0;

        for(int i =0; i<origanal.length-1; i++){
             char ch1 = origanal[i];
             char ch2 = origanal[i+1];
            if(ch1 == ' ') {
                if(ch2 == 'A' || ch2== 'E' || ch2=='I' || ch2=='O' || ch2=='U'){
                    changed[k] = 'a';
                    changed[k+1] = 'n';
                    changed[k+2] = ' ';
                    k = k + 3;
                }
                else {
                    changed[i] = origanal[i];
                    k++;
                }
            }
            else {
                changed[i] = origanal[i];
                k++;
            }

        }
        int j = 0;
        char c1 = '\u0000';
        while(changed[j] != c1) {
            System.out.print(changed[j]);
            j++;
        }

    }
}
