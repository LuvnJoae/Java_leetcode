package Day11_5_21.L617;

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
 1. 直接利用递归，依次叠加各节点的值就可以了
 2. 先判断t1，t2是否为空，这样递归到最下面的节点就直接返回一个空节点。
 a. 如果t1为空，那么返回t2
 b. 如果t2为空，那么返回t1
 c. 如果不满足上面两个条件，则
 i. 新建一个节点，由于如果t1，t2有一个为空就已经返回了，所以可以给新节点的初值取为0.
 ii. 新节点的值=t1的值+t2的值
 iii. 递归进入左节点和右节点
 iv. 返回新节点
 反思
 1. 其实不用定义新节点，直接在源节点的基础上覆盖就可以了，这样节省一点空间。

 */
public class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) return t2;
        if (t2 == null) return t1;

        TreeNode newNode = new TreeNode(0);
        newNode.val = t1.val + t2.val;
        newNode.left = mergeTrees(t1.left,t2.left);
        newNode.right = mergeTrees(t1.right,t2.right);
        return newNode;

    }
}
