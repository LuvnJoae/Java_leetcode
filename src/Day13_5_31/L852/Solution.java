package Day13_5_31.L852;

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
