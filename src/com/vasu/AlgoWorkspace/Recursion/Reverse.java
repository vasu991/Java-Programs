package com.vasu.AlgoWorkspace.Recursion;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Reverse Number:");
        reverse(82695);
    }

    public static void reverse(int num)
    {

        // base condition to end recursive calls
        if (num < 10) {
            System.out.println(num);
            return;
        }

        else {

            // print the unit digit of the given number
            System.out.print(num % 10);

            // calling function for remaining number other
            // than unit digit
            reverse(num / 10);
        }
    }









}
