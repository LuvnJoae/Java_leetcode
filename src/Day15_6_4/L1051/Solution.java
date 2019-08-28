package Day15_6_4.L1051;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public int heightChecker(int[] heights) {
        int[] result = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            result[i] = heights[i];
        }
        Arrays.sort(heights);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (result[i] != heights[i]){
                count++;
            }
            System.out.println(heights[i] + "---" + result[i]);
        }

        return count;
    }

}
