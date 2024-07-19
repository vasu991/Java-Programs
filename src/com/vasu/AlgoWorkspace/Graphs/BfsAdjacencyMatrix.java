package com.vasu.AlgoWorkspace.Graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
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
        Scanner s = new Scanner(System.in);

        int idx = 0;
        int range = s.nextInt();
        int v = s.nextInt();
        int e = s.nextInt();

        int[] IndexLookupArray = new int[range + 1]; // range + 1 since IndexLookupArray[range] should be accessible.
        int[][] adjMatrix = new int[v][v];

        Arrays.fill(IndexLookupArray, 0, range + 1, -1);

        for (int i = 0; i < e; i++) {
            int v1 = s.nextInt();
            if (IndexLookupArray[v1] == -1)
            {
                IndexLookupArray[v1] = idx;
                idx++;
            }
            v1 = IndexLookupArray[v1];

            int v2 = s.nextInt();
            if (IndexLookupArray[v2] == -1)
            {
                IndexLookupArray[v2] = idx;
                idx++;
            }
            v2 = IndexLookupArray[v2];

            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }
        bfsTraversal(adjMatrix);
    }
}
