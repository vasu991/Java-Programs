package com.vasu.Algorithms_RobertSedgewick.QuickUnionUF;

public class WeightedUF {
    private final int[] id;

    public WeightedUF(int N) {
        id = new int[N];
        for(int i = 0; i < N; i++)
            id[i] = i;
    }

    private int root(int i) {
        while( i != id[i] )
            i = id[i];
        return i;
    }

    public boolean connected(int p, int q) {
        int rp = root(p);
        int rq = root(q);
        return rp == rq;
    }

    public void union(int p, int q) {
        int rp = root(p);
        int rq = root(q);
        id[rp] = rq;
    }
    public void display() {
        System.out.println("Connected nodes are represented by same number.");
        for (int j : id) System.out.print(j + " ");
    }

}
