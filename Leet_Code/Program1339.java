package Leet_Code;

public class Program1339 {
    public static void main(String[] args) {
        System.out.println("Hello");
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
class Solution1339 {
    private long res = 0, total = 0;
    
    public int maxProduct(TreeNode root) {
        total = dfs(root); dfs(root);
        return (int)(res % (int)(1e9 + 7));
    }

    private long dfs(TreeNode root) {
        if (root == null) return 0;
        long sub = root.val + dfs(root.left) + dfs(root.right);
        res = Math.max(res, sub * (total - sub));
        return sub;
    }
}