//package com.vasu.AlgoWorkspace.LeetCode;
//
//public class RangeSumOfBST {
//    public int rangeSumBST(TreeNode root, int low, int high) {
//        int sum = traverse(root, low, high, 0);
//        return sum;
//    }
//
//    public static int traverse(TreeNode root, int low, int high, int sum) {
//        if(root == null) {
//            return 0;
//        }
//
//        if(root.val <= low) {
//            traverse(root.right, low, high, sum);
//        }
//        else if(root.val >= high) {
//            traverse(root.left, low, high, sum);
//        }
//        else {
//            traverse(root.left, low, high, sum+root.val);
//            traverse(root.right, low, high, sum+root.val);
//        }
//
//        return sum;
//    }
//    public static void main(String[] args) {
//
//    }
//}
