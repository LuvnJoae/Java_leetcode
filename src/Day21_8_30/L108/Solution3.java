package Day21_8_30.L108;

/**
 * 思路三
 1. 还是递归思路，与思路一、二思想类似，但是前两个思路因为频繁创建新的数组，并且调用Arrays方法进行数组的分割，所以时间上会长一点，那么根据这个耗时点，联想到其实我们并不需要创建新的数组，直接在原数组nums的基础上进行操作也是可以的，我们只是用到了里面的值，并不作更改。所需要的，就是二分的坐标。
 2. 通过创建一个新方法，传递start和end下标，递归，避免了创建两个新数组的耗时。
 反思
 1. 耗时减少，但复杂度其实没变。还是O（n）
 2. 对于/2这种操作，可以用移位来进行，更简便。
 a. >>>:无符号右移
 i. 正数高位补零，负数补1
 b. >>:有符号右移
 都补零
 */
public class Solution3 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return method(nums, 0, nums.length);
    }

    private TreeNode method(int[] nums, int start, int end){
        if (start == end) {
            return null;
        }
        int mid = (start + end) >>> 1;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = method(nums, start, mid);
        root.right = method(nums, mid+1, end);
        return root;
    }
}
