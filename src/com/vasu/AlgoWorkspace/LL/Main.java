package com.vasu.AlgoWorkspace.LL;

import java.util.Arrays;

import static com.vasu.AlgoWorkspace.LL.LL.*;

public class Main {
    public static void main(String[] args) {
        LL list1 = new LL();
        list1.insertFirst(5);
        list1.insertFirst(2);
        list1.insertFirst(3);
        list1.insertFirst(4);
        list1.insertFirst(7);
        list1.insertFirst(2);
//        list1.insertFirst(45);
//        list1.insertFirst(58);
//        list1.insertFirst(20);
//        list1.insertFirst(17);
        displayList(list1);
        int[] ans = nextLargerNodes(list1.get(0));
        System.out.println(Arrays.toString(ans));
    }

    private static void display(LL list) {
        displayList(list);
    }


}
