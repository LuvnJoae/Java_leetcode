package Day9_5_15.L905;

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
