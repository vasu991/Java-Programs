package com.kartik;

public class PerfectSquare {
    public static void main(String[] args) {
        int i = 1;

        while(i*i <= 500) {

            if(i*i >= 5) {
                System.out.print(i * i + " ");
            }
            i++;
        }

    }

}

