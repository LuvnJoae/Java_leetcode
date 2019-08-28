package Day10_5_16.L938;

public class Solution2 {
    public int rangeSumBST(TreeNode root, int L, int R) {
        int sum = 0;
        if (root != null) {
            if (root.val >= L && root.val <= R) {
                sum += root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
            } else if (root.val < L) {
                sum += rangeSumBST(root.right, L, R);
            } else if (root.val > R) {
                sum += rangeSumBST(root.left, L, R);
            }
        }
        return sum;
    }
}
