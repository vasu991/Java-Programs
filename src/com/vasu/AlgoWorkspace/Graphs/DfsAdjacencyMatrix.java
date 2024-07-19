package com.vasu.AlgoWorkspace.Graphs;

import java.util.Arrays;
import java.util.Scanner;

public class DfsAdjacencyMatrix {
    public static void dfs(int i, int[][] graph, boolean[] visited) {
        if(!visited[i]){
            visited[i] = true; // Mark node as "visited"
            System.out.print(i+1 + " ");

            for (int j = 0; j < graph[i].length; j++) {
                if (graph[i][j]==1 && !visited[j]) {
                    dfs(j, graph, visited); // Visit node
                }
            }
        }
    }

    public static void main(String[] args) {
        boolean [] visited = new boolean[10];
        int count = 0;
        int[][] adjMatrix =  {{1,1,0},{1,1,0},{0,0,1}};
        for(int i = 0; i < adjMatrix.length; i++) {
            if(!visited[i]) {
                System.out.println("Compnent: " );
                dfs(i,adjMatrix,visited);
                ++count;
            }
        }
        System.out.println("Total number of Components: " + count);
    }
}
