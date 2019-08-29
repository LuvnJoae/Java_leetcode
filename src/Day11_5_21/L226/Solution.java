package Day11_5_21.L226;

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
 1. 还是递归，定义一个新节点，交换位置就可以了
 2. 如果 节点==null，返回空
 3. 节点不为空，
 a. 定义一个新节点=left
 b. Left = right
 c. right=新节点
 d. 对left 和 right 递归，再次调用本方法
 返回 root（当前节点）
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode newNode = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = newNode;

        return root;
    }
}
