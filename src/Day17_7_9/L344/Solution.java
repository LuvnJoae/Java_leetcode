package Day17_7_9.L344;

public class Solution {
    public void reverseString(char[] s) {
        char temp;
        for (int i = 0; i < (s.length / 2); i++) {
            temp = s[i];
            s[i] = s[s.length - i -1];
            s[s.length - i - 1] = temp;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        char[] s = {'a','b','c','d','e'};
        new Solution().reverseString(s);
    }
}
