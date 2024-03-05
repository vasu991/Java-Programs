package com.kartik;
import java.util.*;
public class ArraySum {
    int[] arr = new int[10];

    int sum;
    public void inputdata(){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the array");
        for(int i =0;i<10;i++) {
            arr[i]= sc.nextInt();
        }
    }
    public void calculate(){
        sum = 0;
        for(int i =0;i<10;i++){
            sum = sum+arr[i];
        }

    }
    public void display(){
        System.out.println("sum: " + sum);
    }

    public static void main(String[] args) {
        ArraySum obj = new ArraySum();
        obj.inputdata();
        obj.calculate();
        obj.display();
    }
}
