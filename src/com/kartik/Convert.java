package com.kartik;
import java.util.*;

public class Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word:");
        String str = sc.nextLine();
        char[] sorted = sort(str);
        System.out.print("sorted word: ");
        for (int i= 0; i< sorted.length; i++) {
            System.out.print(sorted[i]);
        }

    }
    public static char[] sort(String str){
        char[] ch = str.toCharArray();
        for(int i =0;i<str.length()-1;i++){
            for(int j = 0;j<str.length()-i-1;j++){
                if((int)ch[j] > (int)ch[j+1]) {
                    char temp = ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1] = temp;
                }
            }
        }
        return ch;
    }
}
