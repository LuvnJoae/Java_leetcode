package Day13_5_31.L852;

/**
 * 思路2
 1. 和一思路一样，代码简便了一点而已

 */
public class Solution2 {
    public int peakIndexInMountainArray(int[] A) {
        int index=0;
        for(int i=0;i < A.length;i++){
            if(A[i]<A[i+1])
                index=i+1;
            else return index;
        }
        return 0;
    }
}
