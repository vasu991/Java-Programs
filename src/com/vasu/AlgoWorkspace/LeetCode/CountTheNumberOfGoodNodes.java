package com.vasu.AlgoWorkspace.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;

public class CountTheNumberOfGoodNodes {
    public LinkedList<Integer>[] adj;
    public boolean[] visited;


    public int countGoodNodes(int[][] edges) {
        return 0;
    }

    public void insertEdges(int[][] edges) {
        adj = new LinkedList[edges.length + 1];
        visited = new boolean[edges.length + 1];

        for (int i = 0; i < adj.length; i++) {
            adj[i] = new LinkedList<>();
            visited[i] = false;
        }

        for(int i = 0; i < edges.length; i++) {

        }

    }
}
