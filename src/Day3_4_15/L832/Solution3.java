package Day3_4_15.L832;

public class Solution3 {
    public int[][] flipAndInvertImage(int[][] A){
        if (A.length == 1){
            A[0][0] = replace(A[0][0]);
            return A;
        }
        if (A.length % 2 == 0){
            for (int i = 0; i < A.length; i++) {
                for (int min = 0, max = A.length -1; min < max; min++, max--) {
                    int temp = A[i][min];
                    A[i][min] = A[i][max];
                    A[i][max] = temp;

                    A[i][min] = replace(A[i][min]);
                    A[i][max] = replace(A[i][max]);
                }
            }
        }else {
            for (int i = 0; i < A.length; i++) {
                for (int min = 0, max = A.length - 1; min < max; min++, max--) {
                    int temp = A[i][min];
                    A[i][min] = A[i][max];
                    A[i][max] = temp;

                    A[i][min] = replace(A[i][min]);
                    A[i][max] = replace(A[i][max]);
                }
                A[i][(A.length - 1) / 2] = replace(A[i][(A.length - 1) / 2]);
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
