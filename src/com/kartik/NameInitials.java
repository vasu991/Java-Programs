package com.kartik;
import java.util.*;

public class NameInitials {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the name:");
        String str = sc.nextLine();
        String first = String.valueOf(str.charAt(0));
        String second = "";
        String cast = "";

        for (int i=0;i<str.length();i++ ){
            char ch = str.charAt(i);
            if(ch == ' '){
                second = String.valueOf(str.charAt(i+1));
                break;
            }
        }
        for(int i = str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            if(ch == ' '){
                cast = str.substring(i);
                break;
            }
        }
        System.out.println(first + ". " + second +"." + cast);

    }

}
