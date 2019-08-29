package Day10_5_16.L938;

/**
 * 思路2
 1. 也是采用递归的思路进行遍历，不同的是，二叉搜索树的特点是 左> 中>右，所以我们可以在遍历的过程中加入一些条件，使得遍历方向有选择
 2. 方法;
 a. 定义一个变量sum = 0，统计总数
 b. 如果节点不为空，则：
 i. 如果节点值在L和R中间，则sum = sum + data + left。data + right。data；
 ii. 如果节点值 <  L，那么 sum = sum + right。data；
 iii. 如果节点值 >  R，那么 sum = sum + left。data ；
 c. 返回 sum
 这样就只需要遍历在L R之间的节点了。
 */
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
