package Day21_8_30.L108;

import java.util.Arrays;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
}

/**
 * 思路一
 1. 通过递归思路，与二分切片
 2. 将数组的中间值，作为root节点，通过copyOfRange进行切片，分成左右两个数组，对应root节点下的两个左右子树的全体内容。
 3. 通过递归，将左右数组传递进去，再次将两个数组的中间值左右子树的根节点，依次递归。
 4. 当左右数组的长度为1时，代表为最下面一个子节点了，则将这个节点赋值，然后左右字数赋null，返回该节点。
 5. 如果左右数组有一为空的话，即数组长度为0，那么返回null作为空节点。

 反思
 1. 判断一个数组是否为空
 a.
 b. 和之前判断列表是否为空需要
 If( list == null || list.isEmpty())
 c. 一个道理

 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        if (nums.length == 1){
            TreeNode root = new TreeNode(nums[0]);
            root.left = null;
            root.right = null;
            return root;
        }
        int med = nums.length / 2;

        TreeNode root = new TreeNode(nums[med]);
        int[] numsLeft = Arrays.copyOfRange(nums, 0, med);
        int[] numsRight = Arrays.copyOfRange(nums, med+1, nums.length);
        root.left = sortedArrayToBST(numsLeft);
        root.right = sortedArrayToBST(numsRight);
        return root;
    }

}
