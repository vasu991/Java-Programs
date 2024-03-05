package com.kartik;
import java.util.*;
public class Sort {
    int[] arr = new int[10];
    int i;
    int j;
    int temp;
    int k;
    public void inputdata(){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the array:");
        for(i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();

        }

    }
    public void arrange() {
        for(i=0;i<arr.length-1;i++){
            for(j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }

            }
        }


    }
    public void output() {
        System.out.println("Sorted Array:");
        for(k=0; k<arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        Sort obj = new Sort();
        obj.inputdata();
        obj.arrange();
        obj.output();
    }

}
