package Day7_5_13.L461;

public class Solution2 {
    public int hammingDistance(int x, int y) {
        return Integer.toBinaryString(x^y).replaceAll("0","").length();
    }
}
