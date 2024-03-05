package com.kartik;

public class Pattern3 {
    public static void main(String[] args) {
        int letter = 65;
        int number = 1;
        for(int i =1; i<=5; i++){
            for(int j = 5; j>=i ;j--){
                System.out.print((char)letter+" ");
            }
            letter++;
            for(int k = 1; k<=i; k++){
                System.out.print(number+" ");
            }
            number++;
            System.out.println();
        }
    }

}
