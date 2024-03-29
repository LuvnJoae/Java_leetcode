package Day7_5_13.L461;

/**
 * 思路3
 1. 将比较由整体转换成每个位间的比较。不需要像思路2一样，去统计0出现的次数，而是通过移位与异或，每一次只比较一位，相同为0，不同为1，那么把出现的1相加，得到的数就是1出现的次数，即不同的位数。
 2. 把输入的数字之一当作二进制数，先操作最后一位，之后每次右移一位。
 a. 操作：将最后一位与1相与，即可判断最后一位为0或1，同理，另一个输入的数字也这么操作，得到0或1。
 b. 将两个结果异或，相同为0，不同为1，然后统计1出现的个数（相加即可）
 反思
 1. 天才的思路（显然不是我想出来的）
 省去了思路1里判断的时间、时间2里正则表达式的时间，只需要简单的位运算和一次遍历即可。
 */
public class Solution3 {
    public int hammingDistance(int x, int y) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            count += ( ( x >> i ) & 1 ) ^ ( ( y >> i ) & 1);
        }
        return count;
    }
}
