package Day14_6_3.L700;

/**
 * 思路2
 1. 通过迭代
 a. while循环，条件为节点不为空
 i. 值等于节点值，直接返回该节点
 ii. 值大于节点值，当前节点更新 ，等于该节点的右节点
 iii. 值小于节点值，当前节点更新 ，等于该节点的左节点
 b. 循环外，返回空值

 */
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
