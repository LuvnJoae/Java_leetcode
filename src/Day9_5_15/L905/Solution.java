package Day9_5_15.L905;

/**
 * 思路1
 1. 双指针思路，一个指向开始，一个指向末尾
 2. 新建一个数组，大小和原数组相同，新建两个有指针作用的int，min=0和max=A。length-1.
 3. 遍历原数组，对每个元素判断奇偶
 a. 为偶，则新数组【min】 = A【i】，min++（指针向后移动）
 b. 为奇，则新数组【max】 = A【i】，max--（指针向前移动）

 */
public class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        int min = 0, max = A.length-1;
        for (int i = 0; i < A.length; i++) {
//            if ( (A[i] & 1) == 0){
            if ( (A[i] % 2) == 0){   // 相与 或 取余两种都可以，复杂度上没什么明显差别。
                result[min] = A[i];
                min++;
            }else {
                result[max] = A[i];
                max--;
            }
        }
        return result;
    }
}
