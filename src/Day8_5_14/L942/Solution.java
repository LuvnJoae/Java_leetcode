package Day8_5_14.L942;

import java.util.ArrayList;

/**
 * 思路1
 1. 方法：
 a. 每次根据I或D选取A中最小或最大的数字，已经用过的去掉，从没用过的里面选。
 2. 原理：
 a. 如IDID，输出 0 4 1 3 2
 i. 为I，则选取没用过的最小的数字，0；这样，之后的每个数字，无论怎么选，都是 < 0的，也就是说，无论后面的数字是什么，都满足  S[i] == "I"，那么 A[i] < A[i+1]  这个条件
 ii. 为D，同理。
 3. 其他：
 a. JAVA中数组定义后，长度不可变。
 反思
 1. 一开始实现选取最值数字，新创了一个数组包含0~N的值，但这样太占空间，而且赋值还要时间
 后来改成现在这样，由min++，max--，来实现选取最值数字，简便了许多。
 */
public class Solution {
    public static int[] diStringMatch(String S) {
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
