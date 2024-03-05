package com.vasu.Lab.Array2D;
import java.util.*;
public class Main {
    public static void display(Array2DJagged a) {
        System.out.println("Jagged Matrix:");
        for (int i = 0; i < a.row; i++) {
            for (int j = 0; j < a.arr[i].length; j++) {
                System.out.print(a.arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static Array2DJagged createArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the Jagged Array:");
        int row = sc.nextInt();
        Array2DJagged a = new Array2DJagged(row);
        for(int i = 0; i < a.row; i++) {
            System.out.println("Enter the size of " + i + " row:");
            int colSize = sc.nextInt();
            a.setColumn(i, colSize);
        }
        System.out.println("New Jagged Matrix is created.");
        return a;
    }
    public static void inputArray(Array2DJagged a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix:");
        for(int i = 0; i < a.row; i++) {
            System.out.println("Enter the elements of " + i + " row:");
            for(int j = 0; j < a.arr[i].length; j++) {
                System.out.println("Enter the " + j + " element:");
                a.arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elements are added.");
    }
    public static int sumOfRow(Array2DJagged a, int row) {
        int sum = 0;
        for (int i = 0; i < a.arr[row].length; i++) {
            sum = sum + a.arr[row][i];
        }
        return sum;
    }
    public static int sumOfCol(Array2DJagged a, int col) {
        int sum = 0;
        for (int i = 0; i < a.row; i++) {
            sum = sum + a.arr[i][col];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array2DJagged a1 = createArray();
        inputArray(a1);
        display(a1);
        System.out.println("Enter the row you want to calculate sum:");
        int row = sc.nextInt();
        System.out.println("SUM of " + row + " row: " + sumOfRow(a1, row));
        System.out.println("Enter the column you want to calculate sum:");
        int col = sc.nextInt();
        System.out.println("SUM of " + row + " column: " + sumOfCol(a1, col));
    }
}
