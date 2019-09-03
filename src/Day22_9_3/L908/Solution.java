package Day22_9_3.L908;

import java.util.Arrays;

/**
 * 思路一
 1. 首先是这个题的理解，这道题的中文描述太烂了，应该直接机翻过来的，下面是我理解的题目描述：
 a. 给出一个整型数组A，给出一个K值，根据K值，按照 -K<= x <=K的规则，得到任意的整型x，将得到的x，加到A中的每一个元素上，注意，对于A的每一个元素，x不一定要相同，只要满足 -K K的条件都可以，就是说加到A每一个元素的x是不同的。
 b. 当加完后，会生成一个新的数组B，求出所有可能的B 的最大元素和最小元素之间的差值。
 2. 思路：
 a. 其实就是判断A中元素的最大差值 和 x最大范围的大小问题。
 b. 先给A排序，让末尾值减去起始值，得到最大差值
 c. x的最大范围就是2*|K|
 d. 进行一个比较，x大，结果就为0，否则就是二者的差值
 反思
 1. 实现不难，想想怎么优化。
 2. 用了Arrays.sort这个方法，比较费时间

 */
public class Solution {
    public int smallestRangeI(int[] A, int K) {
        if (A == null && A.length == 0) return 0;
        Arrays.sort(A);
        int result = A[A.length-1] - A[0] - 2*Math.abs(K) ;

        if (result <= 0){
            return 0;
        }else {
            return result;
        }

    }
}
