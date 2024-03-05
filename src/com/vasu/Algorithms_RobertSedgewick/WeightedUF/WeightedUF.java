package com.vasu.Algorithms_RobertSedgewick.WeightedUF;

public class WeightedUF { // weighted union find with path compression
    private final int[] id;
    private final int[] sz;


    public WeightedUF(int N) {
        id = new int[N];
        sz = new int[N];
        for(int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
        }


    }

    private int root(int i) {
        while( i != id[i] ) {
            id[i] = id[id[i]];
            i = id[i];
        }
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
        if(sz[rp] > sz[rq]) {
            id[rp] = id[rq];
        } else {
            id[rq] = id[rp];
        }
    }
    public void display() {
        System.out.println("Connected nodes are represented by same number.");
        for (int j : id) System.out.print(j + " ");
    }

}
