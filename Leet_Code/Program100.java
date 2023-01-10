package Leet_Code;

import java.util.ArrayList;

import org.w3c.dom.Node;

public class Program100 {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode();
        tree= new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(1);

        TreeNode rtree = new TreeNode();
        rtree= new TreeNode(1);
        rtree.left = new TreeNode(1);
        rtree.right = new TreeNode(2);


        Solution100 s = new Solution100();
        System.out.println(s.isSameTree(tree, rtree));
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
   class Solution100 {
       public boolean isSameTree(TreeNode p, TreeNode q) {
            if(p == null && q == null)
                return true;
            if(p == null || q == null)
                return false;
            if(p.val != q.val)
                return false;
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
       }
   }