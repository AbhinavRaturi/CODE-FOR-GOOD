package Leet_Code;

public class Program938 {
    public static void main(String[] args) {
        
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
    public int rangeSumBST(TreeNode root, int low, int high) {
       if (root == null)
        return 0;
        int sum = 0;
        if(root.val> low)
            sum+= rangeSumBST(root.left, low, high);
        if(root.val>=low && root.val <= high)
            sum+=root.val;
        if(root.val< high)
            sum+=rangeSumBST(root.right, low, high);
        return sum;
    }
}