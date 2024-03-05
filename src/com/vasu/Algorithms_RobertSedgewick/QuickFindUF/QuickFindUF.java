package com.vasu.Algorithms_RobertSedgewick.QuickFindUF;

public class QuickFindUF {
    private final int[] id;
    public QuickFindUF(int N) {
        id = new int[N];
        for(int i = 0; i < N; i++)
            id[i] = i;
    }




    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];

        for(int i = 0; i < id.length; i++) {
            if(pid == id[i]) id[i] = qid;
        }
    }

    public void display() {
        System.out.println("Connected nodes are represented by same number.");
        for (int i : id) {
            System.out.print(i + " ");
        }
    }

}
