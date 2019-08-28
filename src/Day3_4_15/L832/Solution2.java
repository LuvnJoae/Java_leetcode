package Day3_4_15.L832;

public class Solution2 {
    public int[][] flipAndInvertImage(int[][] A){

        for (int i = 0; i < A.length; i++) {
            for (int min = 0, max = A.length -1; min < max; min++, max--) {
                int temp = A[i][min];
                A[i][min] = A[i][max];
                A[i][max] = temp;
            }
            for (int i1 = 0; i1 < A.length; i1++) {
                A[i][i1] = replace(A[i][i1]);
            }
        }
        return A;
    }
    public int replace(int a){
        if (a == 0){
            return 1;
        }else {
            return 0;
        }
    }
}
