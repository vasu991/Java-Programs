package com.vasu.AlgoWorkspace.LL;

import static com.vasu.AlgoWorkspace.LL.LL.*;

public class Main {
    public static void main(String[] args) {
        LL list1 = new LL();
        list1.insertFirst(1);
        list1.insertFirst(2);
        list1.insertFirst(6);
        list1.insertFirst(3);
        list1.insertFirst(4);
        list1.insertFirst(5);
        list1.insertFirst(6);
        displayList(list1);




    }

    private static void display(LL list) {
        displayList(list);
    }


}
