package Day3_4_15.L832;

/**
 * 思路2
 1. 与思路一基本一样，不同的地方在于，反转这一过程，放在了倒序的for里，省了一个for，但从结果看，时间复杂度也每改变多少。
 2. 缺点在于：需要先判断一下数组是否是一阶矩阵，然后倒序中的每次for都要先判断一下是否为奇有中间数。
 3. 也可以把判断length是否为奇数放在外面，如思路3的代码，但其实结果都差不多，时间效率相差不大。

 */
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
