package Day3_4_15.L832;

public class Solution {
    public int[][] flipAndInvertImage(int[][] A){
//        因为如果A为1阶矩阵，按照这种倒序for循环的条件，是进不去的。
        if (A.length == 1){
            A[0][0] = replace(A[0][0]);
            return A;
        }
        for (int i = 0; i < A.length; i++) {
            for (int min = 0, max = A.length -1; min < max; min++, max--) {
                int temp = A[i][min];
                A[i][min] = A[i][max];
                A[i][max] = temp;

                A[i][min] = replace(A[i][min]);
                A[i][max] = replace(A[i][max]);

                if (min == max - 2) {
                    A[i][min+1] = replace(A[i][min+1]);
                }


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
