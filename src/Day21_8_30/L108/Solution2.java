package Day21_8_30.L108;

import java.util.Arrays;

/**
 * 思路二
 1. 与思路一相同，区别是将 == 1 的判断去掉了，因为这种情况，走到下面分左右数组的时候，左右数组在分割的过程中其实就已经是空数组了（注意不是null ，而是{ }即length==0），这样通过递归终止条件，也是可以判断的的。
 反思
 1. 实际运行效果和思路1一样的。只是简化了代码而已

 */
public class Solution2 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
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
