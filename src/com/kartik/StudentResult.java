package com.kartik;
import java.util.*;

public class StudentResult {
    int marks;
public void input(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter marks");
    marks= sc.nextInt();

}
public void result (){

    if(marks > 40){
        System.out.println("pass");
    }
    else{
        System.out.println("fail");
    }
}

    public static void main(String[] args) {
     StudentResult obj = new StudentResult();
     obj.input();
     obj.result();
    }
}
