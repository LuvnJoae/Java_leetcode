package Day11_5_21.L104;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
}

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int i = maxDepth(root.left);
        int j = maxDepth(root.right);
        return i > j ? i+1 : j+1;
    }
}
