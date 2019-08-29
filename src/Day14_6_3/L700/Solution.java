package Day14_6_3.L700;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

/**
 * 思路1
 1. 通过递归
 a. 先判断，为空，则返回空
 b. 值等于节点值，直接返回该节点
 c. 值大于节点值，返回 递归 右节点
 d. 值小于节点值，返回 递归 左节点
 e. 其他 返回空值
 反思
 就是一般的二叉树搜索值，递归思路
 */
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
