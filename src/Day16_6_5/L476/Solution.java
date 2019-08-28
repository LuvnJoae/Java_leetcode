package Day16_6_5.L476;

public class Solution {
    public int findComplement(int num) {
        //与每一位都是1的数字异或即可。
        String s = Integer.toBinaryString(num);
        double a = Math.pow(2, s.length()) - 1;
        return (int)a ^ num;
    }
}
