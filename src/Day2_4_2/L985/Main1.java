package Day2_4_2.L985;

/**
 * 思路1
 1. 暴力算法
 2. 以query的长度for循环遍历
 3. 每一次循环
 a. 将query按照规则给A值
 b. 对A进行遍历，统计偶数值，求和后赋给answer
 反思
 一般来说，是可以的，但在刷题过程中，存在时间过长的问题，因此不通过，所以考虑其他算法

 思路2
 1. 对于A中的偶数值，不再每一次query循环就遍历统计一次，而是将偶数和先取出，再根据query + A后的值进行对偶数和的增删；
 a. 这样就减少了遍历A的循环时间；
 2. 定义一个 count 存储偶数和
 a. 对A进行遍历，统计出初始的偶数和
 3. 以query的长度for循环遍历
 a. 如果 query是偶数
 i. 如果A中原元素是偶数
 1) 偶数和+query
 2) A元素改变+query
 ii. 如果A中原元素是奇数
 1) 偶数和不变
 2) A元素改变+query
 b. 如果query是奇数
 i. 如果A中原元素是偶数
 1) 偶数和改变-A中原偶数
 2) A元素改变+query
 ii. 如果A中元素是奇数
 1) 偶数和改变+query+A中原奇数
 2) A元素改变+query
 4. 每一次循环后，把偶数和的值给数组answer
 5. 返回
 反思
 1. 算法本身问题不大，时间和空间都是符合要求的，
 2. 但是过于啰嗦，想办法改进一下
 收获
 1. 对于二维数组，.lenth()方法，返回的是行数。

 */

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
