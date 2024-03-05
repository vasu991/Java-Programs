package com.kartik;
public class MinMax {
    public static void main(String[] args) {
        int []arr = new int[]{8,9,2,3,7,22,67};
        System.out.println("maximum value: "+max(arr));
        System.out.println("minimum value: "+min(arr));


    }
    public static int max(int[] b) {
        int m = b[0];
        for(int i = 1; i < b.length; i++) {
            if (m < b[i]) {
                m = b[i];

            }
        }
        return m;

    }
    public static int min(int[] arr ){
        int m= arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (m > arr[i]) {
                m = arr[i];

            }
        }
        return m;


    }
}