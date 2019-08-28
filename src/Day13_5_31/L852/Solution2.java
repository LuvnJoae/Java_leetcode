package Day13_5_31.L852;

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
