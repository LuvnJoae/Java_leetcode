package Day19_7_16.L944;

/**
 * 思路二
 反思
 1. 和第一种思路一样，不同之处是 用charAt（i）方法代替了toCharArray，这样就避免了每次都转成数组耗费的时间和空间。
 思路三和二一样，只不过把首字母提出来放在了外面。
 */
public class Solution2 {
    public int minDeletionSize(String[] A) {
        if (A == null) return 0;
        int count = 0;

        for (int i = 0; i < A[0].length(); i++) {
            for (int i1 = 0; i1 < A.length-1; i1++) {
                if (A[i1 + 1].charAt(i) > A[i1].charAt(i)){
                    count++;
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] A = {"zyx", "wvu", "tsr"};
//        int a = new Solution().minDeletionSize(A);
        System.out.println(new Solution().minDeletionSize(A));
    }
}
