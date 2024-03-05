package com.vasu.AlgoWorkspace.LL;

import static com.vasu.AlgoWorkspace.LL.LL.*;

public class Main {
    public static void main(String[] args) {
        LL list1 = new LL();
        list1.insertLast(4);
        list1.insertLast(7);
        list1.insertLast(8);
        list1.insertLast(9);
        display(list1);

        LL list2 = new LL();
        list2.insertLast(5);
        list2.insertLast(8);

        display(list2);

    }

    private static void display(LL list) {
        displayList(list);
    }


}
