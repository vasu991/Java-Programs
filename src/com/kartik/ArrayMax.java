package com.kartik;
import java. util.*;


public class ArrayMax {
    int max;
    int[] arr = new int[10];
    public void inputdata(){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the array");
        for(int i =0;i<10;i++){
            arr [i]= sc.nextInt();
        }
        }
        public void calculate(){
        max = arr[0];
        for(int i = 1;i<arr.length;i++){
        if(arr[i]>max)
            max= arr[i];

        }



    }
    public void display(){
        System.out.println("max: "+ max );

    }

    public static void main(String[] args) {
        ArrayMax obj = new ArrayMax();
        obj.inputdata();
        obj.calculate();
        obj.display();
    }
}
