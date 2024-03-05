package com.kartik;
public class SelectionSort {
    public static void main(String[] args) {
        int[] sorted = sort(new int[]{2, 3, 4, 7, 8, 9, 11, 12, 15, 20,1,88,55,44,33});
        for (int j : sorted) {
            System.out.printf(j + " ,");
        }
    }

    public static int[] sort(int[] arr) {
        int n = arr.length;

        // One by one move boundary of unsorted sub-array
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;



        }
        return arr;
    }
}