package Day14_6_3.L700;

public class Solution2 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        while (root != null){
            if (root.val == val) return root;
            else if ( root.val < val) root = root.right;
            else root = root.left;
        }
        return null;
    }
}
