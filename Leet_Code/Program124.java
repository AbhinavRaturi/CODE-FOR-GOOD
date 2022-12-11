package Leet_Code;

public class Program124 {
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
       int maxSum = Integer.MIN_VALUE;
       public int maxPathSum(TreeNode root) {
           pathSum(root);
           return maxSum;
       }
       public int pathSum (TreeNode root) {
           if (root == null)
               return 0;
           int leftSum = Math.max(0, pathSum(root.left));
           int rightSum = Math.max(0, pathSum(root.right));
           if ((leftSum + rightSum + root.val) > maxSum)
               maxSum = leftSum + rightSum + root.val;
           return root.val + Math.max(rightSum, leftSum);
       }
   }
