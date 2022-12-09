package Leet_Code;

import java.lang.Math;
public class Program1026 {
    public static void main(String[] args) {
        System.out.println("Testing");
    }
}

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

class Solution {
    public int maxAncestorDiff(TreeNode root) {
        if(root == null)
            return 0;
        return findMax(root, root.val, root.val);
    }
    public int findMax(TreeNode root,int MaxVal, int MinVal){
        if(root ==null){
            return (Integer)Math.abs(MaxVal-MinVal);
        }
        MaxVal = Math.max(root.val, MaxVal);
        MinVal = Math.min(root.val, MinVal);
        int left = findMax(root.left, MaxVal, MinVal);
        int right = findMax(root.right, MaxVal, MinVal);
        return (Integer)Math.max(right, left);
    }
}