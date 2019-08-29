package Day19_7_16.L944;

/**
 * 思路一
 1. 把字符串数组遍历嵌套，一列一列的比较
 a. 每一列的后一个字符比前一个字符大
 b. 设置一个计数器
 反思
 不该每次都转charArray，又花时间又花内存
 */
public class Solution {
    public int minDeletionSize(String[] A) {
        if (A == null) return 0;
        int count = 0;

        for (int i = 0; i < A[0].length(); i++) {
            for (int i1 = 0; i1 < A.length-1; i1++) {
                if (A[i1+1].toCharArray()[i] < A[i1].toCharArray()[i]){
                    count++;
                    break;
                 }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] A = {"zyx", "wvu", "tsr"};
        int a = new Solution().minDeletionSize(A);
        System.out.println(a);
    }
}
