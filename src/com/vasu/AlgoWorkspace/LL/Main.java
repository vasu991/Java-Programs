package com.vasu.AlgoWorkspace.LL;

import static com.vasu.AlgoWorkspace.LL.LL.*;

public class Main {
    public static void main(String[] args) {
        LL list1 = new LL();
        list1.insertFirst(7);
        list1.insertFirst(6);
        list1.insertFirst(5);
        list1.insertFirst(4);
        list1.insertFirst(3);
        list1.insertFirst(2);
        list1.insertFirst(1);
        displayList(list1);
        LL list2;
        list2 = list1.rotateList(list1, 10);
        displayList(list2);

    }

    private static void display(LL list) {
        displayList(list);
    }


}
