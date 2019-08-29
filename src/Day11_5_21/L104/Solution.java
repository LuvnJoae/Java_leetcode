package Day11_5_21.L104;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
}

/**
 * 思路1
 1. 还是递归。
 2. 节点为空，则返回0
 3. 节点不为空，则返回左、右子树的高度
 4. 返回时判断二者大小，返回更大的那个+1.
 反思
 代码可以更简洁
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int i = maxDepth(root.left);
        int j = maxDepth(root.right);
        return i > j ? i+1 : j+1;
    }
}
