package com.kartik;


public class Pattern1 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("the pattern");
        for (int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i = 2;i<=5;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j+" ");

            }
            System.out.println();

        }
    }
}
