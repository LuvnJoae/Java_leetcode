package Day7_5_13.L461;

/**
 * 思路2
 1. 直接将两个数异或，那么不同的位将体现为1.再转成二进制的字符串。
 2. 通过String类的repalceAll方法，将转换成二进制的字符串中的0换成空，那么统计1的个数，这个个数即为最终结果。
 反思
 1. 思路非常清除，而且代码十分简介
 2. 异或本身时间非常短，但是replaceAll占用的时间太久。
 a. 原因：String类的replaceAll方法，查看源码后发现它是使用正则表达式来进行字符串替换的，而在其中，用到了Matcher类的replaceAll方法，这个方法在底层里是通过递归和循环的方式进行查找与替换的，所以时间不可避免的会比较大，对于本题来说，效率比较低。（个人理解）

 */
public class Solution2 {
    public int hammingDistance(int x, int y) {
        return Integer.toBinaryString(x^y).replaceAll("0","").length();
    }
}
