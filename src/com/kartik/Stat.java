package com.kartik;

public class Stat{
    int m,  sd;
    int[] a;
    public Stat(int a[]) {
        for(int i = 0 ;i < a.length; i++) {
            this.a[i] = a[i];
        }

    }
    public static void main(String[] args) {
        int[] a  ={1, 2, 3};
        Stat obj = new Stat(a);
    }
}
