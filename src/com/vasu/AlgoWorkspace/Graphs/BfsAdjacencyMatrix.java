package com.vasu.AlgoWorkspace.Graphs;


import java.util.LinkedList;
import java.util.Queue;
public class BfsAdjacencyMatrix {
    public static void bfsTraversal(int[][] adjMatrix) {
        Queue<Integer> pendingVertices = new LinkedList<>();
        boolean[] visited = new boolean[adjMatrix.length];
        visited[0] = true;
        pendingVertices.add(0);

        while (!pendingVertices.isEmpty()) {
            int currentVertex = pendingVertices.poll();
            System.out.print(currentVertex + " ");
            for (int i = 0; i < adjMatrix.length; i++) {
                if (adjMatrix[currentVertex][i] == 1 && !visited[i]) {
                    pendingVertices.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        boolean [] visited = new boolean[10];
        int count = 0;
        int[][] adjMatrix =  {{1,1,0},{1,1,0},{0,0,1}};
        bfsTraversal(adjMatrix);
    }
}
