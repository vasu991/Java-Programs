package com.vasu.Lab.Array2D;

public class Array2DJagged {
    public int[][] arr;
    int row;

    public Array2DJagged(int row) {
        this.arr = new int[row][];
        this.row = row;
    }

    public void setColumn(int row, int size) {
        this.arr[row] = new int[size];
    }
}
