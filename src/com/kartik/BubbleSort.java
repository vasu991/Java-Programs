package com.kartik;
public class BubbleSort {
    public static int[] sort(int[] arr) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (!swapped)
                break;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] sorted = sort(new int[]{2, 3, 4, 7, 8, 9, 11, 12, 15, 20,1,88,55,44,33});
        for (int j : sorted) {
            System.out.printf(j + " ,");
        }

    }
}