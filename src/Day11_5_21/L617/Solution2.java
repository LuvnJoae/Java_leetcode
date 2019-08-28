package Day11_5_21.L617;

public class Solution2 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        if (t1 == null) return t2;
        if (t2 == null) return t1;

        t1.val += t2.val;
        // 再递归合并左右子树
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
}
