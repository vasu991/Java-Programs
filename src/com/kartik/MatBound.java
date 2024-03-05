package com.kartik;
import java.util.*;


public class MatBound {
    int [][] mat;
    int size;
    public MatBound(int size){
        this.size= size;
        mat = new int[size][size];
    }
    public void accept(){

        Scanner sc = new Scanner (System.in);
        System.out.println("enter the matrix");
        for(int i =0;i< mat.length;i++){
            for(int j =0;j< mat.length;j++){
                System.out.print("enter the ("+i+","+j+") element: ");
                mat[i][j]=sc.nextInt();
            }
        }
    }

    public int findsum() {
        int sum = 0;
     for(int i =0;i<size;i++){
         sum = sum + mat[0][i];
         sum = sum + mat[i][0];
         sum = sum + mat[i][size-1];
         sum = sum + mat[size-1][i];
     }
     sum = sum - mat[0][0] - mat[size-1][0] - mat[0][size-1] -mat[size-1][size-1];
     return sum;
    }
    public void display() {
        System.out.println("the matrix:");
        for (int[] ints : mat) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MatBound obj = new MatBound(3);
        obj.accept();
        System.out.println("sum of outer elements: " + obj.findsum());
        obj.display();
    }


}
