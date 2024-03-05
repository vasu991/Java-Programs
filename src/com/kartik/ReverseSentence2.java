package com.kartik;
import java.util.*;

public class ReverseSentence2 {
    String s;
    public void getString(){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the sentence");
        s = sc.nextLine();
        s = " "+s;
    }
    public void reverse(){
        int last = s.length();
        String sub;
        for(int i=s.length()-1;i>=0; i--){
            char dj  = s.charAt(i);
            if(dj==' ') {
                sub = s.substring(i+1, last);
                System.out.print(sub+" ");
                last = i;
            }

        }
    }
    //the program is an analogy of choti hanging upside down from a tree, and we don't need to straighten him
    // we just click the pic and rotate in edit
    public static void main(String[] args) {
        ReverseSentence2 obj = new ReverseSentence2();
        obj.getString();
        obj.reverse();
    }
}
