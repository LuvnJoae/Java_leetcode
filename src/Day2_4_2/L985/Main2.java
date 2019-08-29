package Day2_4_2.L985;

/**
 * 	1. 还是利用偶数和，只对query指向的那个A值进行修改，避免了每次循环都要遍历A的时间问题，但与上面不同的是，不再对query进行奇偶判断，而是重点针对被修改后的A的值
 2. 求偶数和
 3. 以query的长度for循环遍历
 a. 判断如果原A是偶数
 i. 偶数和删去A的值
 b. A值进行更新
 c. 判断如果A依然是偶数
 i. 偶数和加上A值
 4. 偶数和给answer
 5. 输出
 反思
 没啥好反思的，效果非常棒
 */
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
