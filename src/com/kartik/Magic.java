package com.kartik;
import java.util.*;

public class Magic {
    String str;
    public  Magic (){
        str ="";
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word: ");
        str = sc.nextLine();
    }

    public boolean  check(){
        for(int i =0; i<str.length()-1;i++ ){
            if((int)str.charAt(i+1)-(int)str.charAt(i) == 1){
                return true;
            }
        }
        return false;

    }
    public void display(){

        if(check()) {
            System.out.println("magic word!!");
        }
        else {
            System.out.println("not a magic word!!");
        }
    }
    public static void main(String[] args) {
        Magic obj = new Magic();
        obj.input();
        obj.display();

    }
}
