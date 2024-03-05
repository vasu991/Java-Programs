package com.kartik;
import java.util.*;

public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        System.out.println("enter the matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }
        System.out.println("original matrix:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] trans = transpose(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] != trans[i][j]) {
                    System.out.println("not symmetric matrix!!");
                    return ;
                }

            }
        }
        System.out.println("symmetric matrix");
    }

    public static int[][] transpose(int[][] matrix) {

        int[][] trans = new int[3][3];
        for(int i = 0;i < trans.length; i++){
            for(int j = 0;j < trans.length; j++){
                trans[i][j] = matrix[j][i];

            }
        }
        System.out.println("transpose matrix:");

        for(int i = 0;i < matrix.length;i++){
            for(int j = 0; j < matrix.length; j++){
                System.out.print(trans[i][j] + "\t");
            }
            System.out.println();
        }
        return trans;

    }
}
