package Day10_5_16.L938;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
public class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        int sum = 0;
        if ( root != null){
            if ( root.val >= L && root.val <= R ){
                sum += root.val;
            }
            sum += rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
        }
        return sum;
    }
}
