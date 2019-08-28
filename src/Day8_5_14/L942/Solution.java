package Day8_5_14.L942;

import java.util.ArrayList;

public class Solution {
    public static int[] diStringMatch(String S) {
        /**
         * 	1. 方法：
         a. 每次根据I或D选取A中最小或最大的数字，已经用过的去掉，从没用过的里面选。
            2. 原理：
         a. 如I D I D，输出 0 4 1 3 2
         b. 为I，则选取没用过的最小的数字，0；这样，之后的每个数字，无论怎么选，都是 < 0的，
            也就是说，无论后面的数字是什么，都满足  S[i] == "I"，那么 A[i] < A[i+1]  这个条件
         c. 为D，同理。
         */
        char[] cs = S.toCharArray();
        int min = 0, max = cs.length;
        int[] a = new int[max+1];

        for (int i = 0; i < cs.length; i++) {
            if (cs[i] == 'I'){
                a[i] = min;
                min++;
            }else {
                a[i] = max;
                max--;
            }
        }
        a[cs.length] = max;

        return a;
    }
}
