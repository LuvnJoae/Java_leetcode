package Day14_6_3.L700;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (val == root.val){
            return root;
        }
        else if (val < root.val){
            return searchBST(root.left, val);
        }
        else if (val > root.val){
            return searchBST(root.right, val);
        }
        else
            return null;
    }
}
