package Day7_5_13.L461;

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
