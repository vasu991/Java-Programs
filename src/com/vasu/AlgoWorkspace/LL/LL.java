package com.vasu.AlgoWorkspace.LL;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }



    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        if(index > size) {
            System.out.println("invalid index");
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public void duplicates() {
        Node node = head;
        while(node.next != null) {
            if(node.next.value == node.value) {
                node.next = node.next.next;
                size--;
            }
            else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;

    }

    public LL partition(LL list, int x) {
        LL newList = new LL();
        Node curr = list.head;
        Queue<Integer> que = new ConcurrentLinkedQueue<>();

        Node start = new Node(0);
        newList.head = start;

        while(curr != null) {
            if(curr.value < x) {
                Node node = new Node(curr.value);
                start.next = node;
                start = start.next;
            }
            else {
                que.add(curr.value);
            }
            curr = curr.next;
        }
        while(que.size() > 0) {
            Node node = new Node(que.poll());
            start.next = node;
            start = start.next;
        }
        newList.head = newList.head.next;
        return newList;
    }



    public boolean hasCycle(LL list) {
        Node fast = list.head;
        Node slow  = list.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return true;
            }
        }

        return false;


    }

    public static int[] nextLargerNodes(Node head) {
        // Convert linked list to ArrayList for easier access
        ArrayList<Integer> values = new ArrayList<>();
        Node curr = head;
        while (curr != null) {
            values.add(curr.value);
            curr = curr.next;
        }

        int[] answer = new int[values.size()];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < values.size(); i++) {
            // Maintain the stack to store indices of values
            while (!stack.isEmpty() && values.get(stack.peek()) < values.get(i)) {
                answer[stack.pop()] = values.get(i);
            }
            stack.push(i);
        }

        // Any index left in stack means there was no greater value to the right
        while (!stack.isEmpty()) {
            answer[stack.pop()] = 0;
        }

        return answer;
    }

    public int lengthOfCycle(LL list) {
        int length = 0;

        Node fast = list.head;
        Node slow  = list.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                //calculate length of cycle
                Node temp = slow;
                do {
                    length++;
                    temp = temp.next;
                } while(temp != fast);
                return length;

            }
        }

        return 0;


    }


    public Node detectCycleStart(LL list) {
        int length;

        length = lengthOfCycle(list);
        //find the start node
        Node f = head;
        Node s = head;
        while(length > 0) {
            s = s.next;
            length--;
        }

        while(s != f) {
            s = s.next;
            f = f.next;
        }

        return s;

    }
    



    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if(index == 0) {
            return deleteFirst();
        }
        if(index == size-1) {
            return deleteLast();
        }
        if(index > size-1) {
            System.out.println("invalid index");
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public LL rotateList(LL l, int k) {
         k = k % l.size;
         if(k == 0) {
            return l;
        }
        LL rl = new LL();
        rl.head = new Node(0);
        Node temp1 = l.head;
        Node temp2 = l.get(l.size - k);

        for(int i = 0; i < size; i++) {
            if(temp2 != null) {
                rl.insertLast(temp2.value);
                temp2 = temp2.next;
            }
            else {
                rl.insertLast(temp1.value);
                temp1 = temp1.next;
            }
        }

        return rl;


    }



    public void makeCycle(LL list, int connectIndex) {
        Node last = get(size-1);
        Node join = get(connectIndex);
        last.next = join;
    }

    public static void displayList(LL list) {
        Node temp = list.head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static LL merge(LL first, LL second) {
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }

        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
    }

    public void displayNode(Node node) {
        System.out.println(node.value);
    }

    public static int nodeValue(Node node) {
        return node.value;
    }






    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}