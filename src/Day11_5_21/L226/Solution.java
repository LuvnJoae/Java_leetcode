package Day11_5_21.L226;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
}

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode newNode = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = newNode;

        return root;
    }
}
