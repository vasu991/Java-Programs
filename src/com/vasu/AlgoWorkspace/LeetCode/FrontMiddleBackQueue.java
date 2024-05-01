package com.vasu.AlgoWorkspace.LeetCode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;


public class FrontMiddleBackQueue {
    Deque<Integer> q1;
    Deque<Integer> q2;
    int size;

    public FrontMiddleBackQueue() {
        this.q1 = new ArrayDeque<>();
        this.q2 = new ArrayDeque<>();
        this.size = 0;
    }

    public void pushFront(int val) {
        if(size % 2 == 0) {
            q1.addFirst(val);
        }
        else {
            q1.addFirst(val);
            q2.addFirst(q1.removeLast());
        }

        size++;

    }

    public void pushMiddle(int val) {
        if(size % 2 != 0) {
            q2.addFirst(q1.removeLast());
            q1.addLast(val);
        }
        else {
            q1.addLast(val);
        }

        size++;
    }

    public void pushBack(int val) {
        if(size % 2 != 0) {
            q2.addLast(val);
        }
        else {
            q2.addLast(val);
            q1.addLast(q2.pop());
        }

        size++;

    }

    public int popFront() {
        if(size == 0) {
            return -1;
        }

        if(size % 2 == 0) {
            q1.addLast(q2.pop());
            size--;
            return q1.pop();

        }
        else {
            size--;
            return q1.pop();
        }

    }

    public int popMiddle() {
        if(size == 0) {
            return -1;
        }

        if(size % 2 != 0) {
            size--;
            return q1.removeLast();
        }
        else {
            int mid = q1.removeLast();
            q1.addLast(q2.pop());
            size--;
            return mid;
        }

    }

    public int popBack() {
        if(size == 0) {
            return -1;
        }

        if(size % 2 != 0) {
            q2.addFirst(q1.removeLast());
            size--;
            return q2.removeLast();
        }
        else {
            size--;
            return q2.removeLast();
        }

    }

    public void display() {
        System.out.print(Arrays.toString(q1.toArray()));
        System.out.println(Arrays.toString(q2.toArray()));
    }

    public static void main(String[] args) {
        FrontMiddleBackQueue q = new FrontMiddleBackQueue();
        q.pushFront(1);   // [1]
        q.display();
        q.pushBack(2);    // [1, 2]
        q.display();
        q.pushMiddle(3);  // [1, 3, 2]
        q.display();
        q.pushMiddle(4);  // [1, 4, 3, 2]
        q.display();
        q.popFront();     // return 1 -> [4, 3, 2]
        q.display();
        q.popMiddle();    // return 3 -> [4, 2]
        q.display();
        q.popMiddle();    // return 4 -> [2]
        q.display();
        q.popBack();      // return 2 -> []
        q.display();
        q.popFront();     // return -1 -> [] (The queue is empty)
        q.display();

    }
}
