package Day10_5_16.L938;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

/**
 * 思路1
 1. 其实就是二叉树的遍历，所谓二叉搜索树，指的就是
 a.
 2. 所以，给出的root里包含的数据，就是从上到下的二叉树中的数据
 3. 那么，找到L和R中间的数值和，就中序遍历二叉树，把在L和R中间的数值相加，得到结果。
 4. 采用递归思路
 a. 定义一个变量sum = 0，统计总数。
 b. 如果节点不为空，则：（为空则返回sum=0初始值）
 i. 如果节点值在L和R中间，则sum = sum + data；
 ii. Sum  = sum + rang（left）+rang（right）
 c. 最后返回 sum
 5. 在上述过程中，递归的方法实现了中序遍历二叉树，如果这个节点的值满足L R。那么记录下来，然后继续遍历左右子树，将满足的值返回给上一级，遍历到最后没有节点了，返回值就是0。所以满足条件的节点通过递归累加起来，就是结果。
 反思1
 1. 时间效率低，因为这种遍历方式，需要将二叉树的每个节点都遍历一遍，而不是根据二叉搜索树的特性进行遍历，所以时间会大一点。
 2. 思路2根据二叉搜索树大小排序的特点进行遍历。

 */
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
