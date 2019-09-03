package Day22_9_3.L908;

/**
 * 思路二
 和思路1一样，不过自己直接写个for来寻找max和min，这样比用Arrays.sort快，没必要对整个数组进行排序，找到max和min就可以了。
 */
public class Solution2 {
    public int smallestRangeI(int[] A, int K) {
        if (A == null && A.length == 0) return 0;
        int max = A[0];
        int min = A[0];
        for (int i : A) {
            if (max < i){
                max = i;
            }
            if (min > i){
                min = i;
            }
        }
        return max-min-2*K <= 0 ? 0 : max-min-2*Math.abs(K);


    }
}
