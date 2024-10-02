package com.vasu.AlgoWorkspace.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;


public class LeafSimilarTrees {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> seq1 = new ArrayList<>();
        ArrayList<Integer> seq2 = new ArrayList<>();
       leafs(root1, seq1);
       leafs(root2, seq2);

       if(seq1.size() != seq2.size()) {
           return false;
       }
       for(int i = 0; i < seq1.size(); i++) {
           if(!seq1.get(i).equals(seq2.get(i))) {
               return false;
           }
       }

       return true;
    }

    public static void leafs(TreeNode root, ArrayList<Integer> seq) {
        if(root == null) {
            return;
        }

        if(root.left == null && root.right == null) {
            seq.add(root.val);
        }

        leafs(root.left, seq);
        leafs(root.right, seq);
    }
}
