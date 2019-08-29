package Day11_5_21.L104;

/**
 * 思路2
 和思路一一样，代码更简洁
 */
public class Solution2 {
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }}
