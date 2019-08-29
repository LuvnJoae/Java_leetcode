package Day13_5_31.L852;

/**
 * 思路1
 1. 题目给的数组就是山脉数组，所以直接找出最大值就好了

 */
public class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int max = A[0];
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if ( max < A[i]){
                max = A[i];
                if (max > A[i+1]){
                    index = i;
                }
            }
        }
        return index;
    }
}
