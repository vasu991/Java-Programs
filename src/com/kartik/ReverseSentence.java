package com.kartik;
import java.util.Scanner;
public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String str = sc.nextLine();
        int len = str.length();
        int space = 0;
        for(int i=0;i<len;i++) {
            String ch = String.valueOf(str.charAt(i));
            if(ch.equals(" ")) {
                space++;
            }
        }
        String[] arr = new String[space+1];
        String sub;
        int j = 0;
        int ctr = 0;
        int last = 0;
        for(int i=0;i<len;i++) {
            char ch = str.charAt(i);
            if(ctr==space) {
                sub = str.substring(last);
                arr[j] = sub;
                break;
            }
            if(ch==' ') {
                sub = str.substring(last,i);
                arr[j] = sub;
                j++;
                last  = i+1;
                ctr++;
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            System.out.printf(arr [i]+" ");
        }

    }
}