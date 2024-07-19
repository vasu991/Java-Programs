package com.vasu.AlgoWorkspace.LeetCode;
class TreeNode {
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


public class StepByStepDirectionsFromABinaryTreeNodeToAnother {


    public String getDirections(TreeNode root, int startValue, int destValue) {
        String rts = findPath(root, startValue);
        String rtt = findPath(root, destValue);
        int p = 0;
        if(rts.length() > rtt.length()) {
            while(p < rts.length()) {
                if(rts.charAt(p) == rtt.charAt(p)) {
                    p++;
                }
                else {
                    break;
                }
            }
        }
        else if(rts.length() < rtt.length()) {
            while(p < rtt.length()) {
                if(rts.charAt(p) == rtt.charAt(p)) {
                    p++;
                }
                else {
                    break;
                }
            }
        }
        else {
            while(p < rtt.length()) {
                if(rts.charAt(p) == rtt.charAt(p)) {
                    p++;
                }
                else {
                    break;
                }
            }
        }
        String lcas = "";
        for (int i = p; i < rts.length(); i++) {
            lcas = lcas + "U";
        }
        String lcat = rtt.substring(p);
        String path = lcas + lcat;
        return path;
    }
public static String findPath(TreeNode root, int target) {
    StringBuilder path = new StringBuilder();
    if (findPathHelper(root, target, path)) {
        return path.toString();
    } else {
        return ""; // Return an empty string if the target is not found in the tree
    }
}

    private static boolean findPathHelper(TreeNode current, int target, StringBuilder path) {
        if (current == null) {
            return false;
        }
        if (current.val == target) {
            return true;
        }
        // Check left subtree
        path.append("L");
        if (findPathHelper(current.left, target, path)) {
            return true;
        }
        path.deleteCharAt(path.length() - 1); // Backtrack if not found in left subtree

        // Check right subtree
        path.append("R");
        if (findPathHelper(current.right, target, path)) {
            return true;
        }
        path.deleteCharAt(path.length() - 1); // Backtrack if not found in right subtree

        return false;
    }

    public static void main(String[] args) {
        TreeNode four = new TreeNode(4, null, null);
        TreeNode six = new TreeNode(6, null, null);
        TreeNode three = new TreeNode(3, null, null);
        TreeNode one = new TreeNode(1, three, null);
        TreeNode two = new TreeNode(2, six, four);
        TreeNode five = new TreeNode(5, one, two);
//        System.out.println(two.right.val);
        StepByStepDirectionsFromABinaryTreeNodeToAnother obj = new StepByStepDirectionsFromABinaryTreeNodeToAnother();
        System.out.println(obj.getDirections(five, 3, 6));

    }
}
