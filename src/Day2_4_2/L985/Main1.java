package Day2_4_2.L985;



public class Main1 {
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

    public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] ansewer = new int[queries.length];
        int count = 0;
        int temp = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0){
                count += A[i];
            }
        }
        for (int i = 0; i < queries.length; i++) {
            if ( queries[i][0] % 2 == 0 ){
                if (A[queries[i][1]] % 2 == 0){
                    count += queries[i][0];

                    A[queries[i][1]] += queries[i][0];
                }else {
                    A[queries[i][1]] += queries[i][0];
                }
            }else {
                if (A[queries[i][1]] % 2 ==0 ){
                    temp = A[queries[i][1]];
                    count = count - temp;

                    A[queries[i][1]] += queries[i][0];
                }else {
                    count += queries[i][0] + A[queries[i][1]];

                    A[queries[i][1]] += queries[i][0];
                }
            }
            System.out.println(count);
            ansewer[i] = count;
        }

        return ansewer;

    }
}
