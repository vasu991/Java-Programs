package com.vasu.Algorithms_RobertSedgewick.QuickUnionUF;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of objects you want in the space:");
        int num = sc.nextInt();

        WeightedUF uf1 = new WeightedUF(num);
        int check;

        System.out.println();

        System.out.println("Union process starts!!");
        System.out.println("If yoy want to stop enter '1' else enter any number:");
        check = sc.nextInt();

        while(check != 1) {

            System.out.println("Enter the two objects you want to join:");
            int p = sc.nextInt();
            int q = sc.nextInt();

            if(!uf1.connected(p, q)) {
                uf1.union(p, q);
                System.out.println(p + " and " + q + " are connected.");
            }

            System.out.println("If yoy want to stop enter '1' else enter any number:");
            check = sc.nextInt();

        }
        System.out.println("Union process ends!!");

        uf1.display();



    }
}
