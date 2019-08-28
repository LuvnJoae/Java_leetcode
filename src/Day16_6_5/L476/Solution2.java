package Day16_6_5.L476;

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
