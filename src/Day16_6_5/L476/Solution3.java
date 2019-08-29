package Day16_6_5.L476;

/**
 * 思路3
 1. 先用temp存储原num值
 2. while循环，条件为temp > 0
 a. Temp 右移一位
 b. C = （c << 1）+1
 c. 这样其实就是通过temp的移位，确定二进制的位数
 3. 异或返回

 */
public class Solution3 {
    public int findComplement(int num) {
        int temp = num;
        int c =0;
        while (num > 0){
            num >>= 1;
            c = (c << 1 ) + 1;
        }
        return temp^ c;
    }
}
