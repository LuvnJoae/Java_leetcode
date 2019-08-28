package Day2_4_2.L985;

public class Main2 {
    public static void main(String[] args) {
        int[] A = new int[]{
                1,2,3,4
        };
        int[][] queries = {{1,0},{-3,1},{-4,0},{2,3}};
        int[] n = sumEvenAfterQueries(A,queries);
        for (int i = 0; i < 4; i++) {
            System.out.println(n[i]);;
        }
    }

    public static int[] sumEvenAfterQueries(int[] A, int[][] queries){
        int[] ansewer = new int[queries.length];
    int count = 0;

        for (int i = 0; i < A.length; i++) {
        if (A[i] % 2 == 0){
            count += A[i];
        }
    }

        for (int i = 0; i < queries.length; i++) {
        if (A[queries[i][1]] % 2 == 0){
            count -= A[queries[i][1]];
        }
        A[queries[i][1]] += queries[i][0];
        if (A[queries[i][1]] % 2 == 0){
            count += A[queries[i][1]];
        }
        ansewer[i] = count;
    }
        return ansewer;
}
}
