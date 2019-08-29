package Day2_4_2.L977;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 思路1
 1. for循环，将自身元素平方后，返还给自身
 2. 用Arrays工具类排序
 3. 返回数组

 */
public class Main1 {
    public static void main(String[] args) {
        int[] ints = new int[]{
             -4,-1,0,3,10
        };
        sort(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public static int[] sort(int[] ints){
        for (int i = 0; i < ints.length; i++) {
            ints[i] = ints[i] * ints[i];
        }
        Arrays.sort(ints);
        return ints;

    }
}
