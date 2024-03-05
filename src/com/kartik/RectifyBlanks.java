package com.kartik;
import java.util.*;
public class RectifyBlanks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the sentence:");
//        String s1 = sc.nextLine();
        String s = "vasu   bhatia   is  a  good   boy.";
        String[] c = changed(s);
        for(int i = 0; i<c.length; i++) {
            System.out.print(c[i] + " ");
        }

    }
    public static String[] changed(String s) {
        int words = 0;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                words++;
                char ch1 = s.charAt(i+1);
                while(ch1 == ' ') {
                    i++;
                    ch1 = s.charAt(i);
                }
            }
        }
        String[] str = new String[words+1];
        int j = 0;
        int start = 0;
        for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == ' ') {
                str[j] = s.substring(start, i);
                j++;
                char ch1 = s.charAt(i+1);
                while(ch1 == ' ') {
                    i++;
                    ch1 = s.charAt(i);
                }
                start = i;
            }
        }
        str[j] = s.substring(start);
        return str;

    }
}
