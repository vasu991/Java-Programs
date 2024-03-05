package com.kartik;
import java.util.*;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];
        System.out.println("enter ten numbers of the array");
        for(int i =0;i<10;i++){
            System.out.println("enter "+i+" element");
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target element");
        int target = sc.nextInt();
        int position = BinarySearch.binSearch(arr, target);
        if(position==-1){
            System.out.println("target element not found");
        }
        else{
            System.out.println("target element found at "+position+" position");
        }
        if(prime(target)){
            System.out.println("target is prime");
        }
        else{
            System.out.println("target is not prime");
        }
    }
    public static boolean prime(int p){
        for(int i =2 ;i<=p/2;i++){
            if(p%i==0){
                return false;
            }
        }
        return true;
    }
}

