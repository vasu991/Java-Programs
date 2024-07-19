package com.vasu.AlgoWorkspace.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumbersInAMatrix {
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int[] minR = new int[matrix.length];
        int[] maxC = new int[matrix[0].length];
        Arrays.fill(maxC, 0, maxC.length - 1, 0);

        for(int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] < min) {
                    min = matrix[i][j];
                }
                if(matrix[i][j] > maxC[j]) {
                    maxC[j] = matrix[i][j];
                }
            }
            minR[i] = min;
        }

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == minR[i] && matrix[i][j] == maxC[j]) {
                    ans.add(matrix[i][j]);
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(Arrays.toString(luckyNumbers(matrix).toArray()));
    }
}
