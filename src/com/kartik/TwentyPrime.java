package com.kartik;

public class TwentyPrime {
    public static void main(String[] args) {
        System.out.print("2 ");
        int limit = 0;
        int num = 3;
        while(limit<20){
            if(isPrime(num)){
                System.out.print(num+" ");
                limit++;
            }
            num++;
        }
    }
    public  static boolean isPrime(int x){
        for(int i = 2;i<=(x/2);i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
}
