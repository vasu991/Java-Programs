package com.vasu.AlgoWorkspace.LeetCode;

public class FindPositiveNegative {
    public static void main(String[] args) {
//        int[] arr = {-12, -10, -8, -7 , -6, -3, -2, -1,1, 1, 2, 1, 2, 3, 4, 5, 6, 35, 37, 50};
//        int[] arr = {55, 66, 85, 99, 101, 136, 290};
//        int[] arr = {-121, 100, -90, -85, -80, -76, -50, -39, -11};
//        System.out.println(search(arr));



    }

    public static int search(int[] arr) {
        int l = 0, r = arr.length - 1;
        int m = 0;
        while (l <= r) {
            m = l + (r - l) / 2;

            if (arr[m] <= 0)
                l = m + 1;

            else
                r = m - 1;
        }
        return m;

    }
}
