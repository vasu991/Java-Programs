package com.kartik;
public class BinarySearch {
    public static void main(String[] args) {

        int[] arr;
        arr = new int[]{5, 7, 11, 88, 99, 100, 125, 177};
        int target = 101;
        if(binSearch(arr,target) == -1) {
            System.out.println("element not found.");
        }
        else {
            System.out.println("element found at "+binSearch(arr,target)+" index.");
        }
    }

    public static int binSearch(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if target is present at mid
            if (arr[m] == target)
                return m;

            // If target greater, ignore left half
            if (arr[m] < target)
                l = m + 1;

                // If target is smaller, ignore right half
            else
                r = m - 1;
        }
        return -1;

    }
}