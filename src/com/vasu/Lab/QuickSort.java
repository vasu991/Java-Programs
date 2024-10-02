package com.vasu.Lab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Queue;

public class QuickSort {
    int comparisons;
    int swaps;
    public int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int pIndex = start;

        for(int i = start; i <= end - 1; i++) {
            this.comparisons++;
            if(arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex] = temp;
                pIndex++;
                this.swaps++;
            }
        }

        int temp = arr[pIndex];
        arr[pIndex] = arr[end];
        arr[end] = temp;
        this.swaps++;

        return pIndex;

    }
    public void sort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivot = partition(arr, start, end);

        sort(arr, start, pivot - 1);
        sort(arr, pivot + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 1, 6, 8, 5, 3, 4};

        QuickSort obj = new QuickSort();
        obj.sort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
        System.out.println("Comparisons: " + obj.comparisons);
        System.out.println("Swaps: " + obj.swaps);
    }
}
