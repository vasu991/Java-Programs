package com.kartik;
import java.util.*;


public class FindEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number of values you want to enter:");
        int l = sc.nextInt();
        int [] arr = new int[l];
        System.out.println("enter the elements:");
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            if(arr[i]== 0){
                System.out.println("program ends!!");
                return;
            }

        }
        System.out.println("Largest Even Number: "+even(arr));
        System.out.println("Smallest Odd Number: "+odd(arr));


    }
    public static int even(int []arr){
        int max = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                if(arr[i]>max){
                    max = arr[i];
                }

            }

        }// maximum is found here
        return max;

    }
    public static int odd(int []arr){
        int min = 0;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i]%2 != 0) {
                min = arr[i];
                break;
            }
        }// assigning first odd value to min

        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2 != 0){
                if(arr[i]<min){
                    min = arr[i];
                }

            }

        }// minimum is found here
        return min;

    }
}
