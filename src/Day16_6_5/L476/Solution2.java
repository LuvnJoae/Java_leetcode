package Day16_6_5.L476;

/**
 * 思路2
 1. 先通过Integer.toBinaryString（）方法，将数字转成二进制字符串
 2. 设置变量c=0
 3. 根据其长度循环
 a. C = （c << 1）+1
 b. 这样就可以根据原数字的长度，找到同样长度的11111···
 4. 异或返回
 反思
 1. 还是用到了Integer.toBinaryString（）方法，还可以更简单

 */
public class Solution2 {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        int c =0;
        for (int i = 0; i < s.length(); i++) {
            c = (c << 1) + 1;
        }
        return num ^ c;
    }
}
