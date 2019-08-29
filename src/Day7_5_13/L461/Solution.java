package Day7_5_13.L461;

/**
 * 思路1
 1. 通过Integer.toBinaryString(),转成二进制，从后向前，进行比较
 2. 进行两次循环
 a. 第一次，选取较小的数字转换成二进制后的长度作为循环次数，自后向前进行比较
 b. 第二次，将较大的数字转换成二进制后，且剩余的位数，查看是否为1
 c. 统计上述个数。
 反思
 思路是对的，但是实现起来有点复杂，不够简洁
 */
public class Solution {
    public int hammingDistance(int x, int y) {
        Integer a = Integer.valueOf(x);
        Integer b = Integer.valueOf(y);

        char[] cs1 = Integer.toBinaryString(a).toCharArray();
        char[] cs2 = Integer.toBinaryString(b).toCharArray();

        int numMin = a < b ?  cs1.length : cs2.length;
        int numMax = a > b ?  cs1.length : cs2.length;
        char[] csMax = a > b ? cs1 : cs2;

        int count = 0;

        for (int i = 1; i <= numMin; i++) {
            if (cs1[cs1.length - i] != cs2[cs2.length-i]){
                count++;
            }
        }
        for (int i = 0; i < (numMax - numMin); i++ ){
            if (csMax[i] != '0'){
                count++;
            }
        }
        return count;
    }
}
