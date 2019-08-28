package Day5_4_18.L657;

public class Solution2 {
    public boolean judgeCircle(String moves) {
        int[] count = new int[26];
        for (char c : moves.toCharArray()) {
            count[c - 'A']++;
        }
        return count['L' - 'A'] == count['R' - 'A'] && count['U' - 'A'] == count['D' - 'A'];

    }
}
