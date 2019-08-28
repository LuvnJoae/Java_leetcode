package Day7_5_13.L461;

public class Solution3 {
    public int hammingDistance(int x, int y) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            count += ( ( x >> i ) & 1 ) ^ ( ( y >> i ) & 1);
        }
        return count;
    }
}
