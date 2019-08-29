package Day17_7_9.L344;

/**
 * 思路1
 1. 不能用额外的数组空间，只能用O（1）的额外空间，那就直接首尾互换呗，用一个temp字符当中转。
 反思
 1. 速度太慢了，但是为什么啊？

 思路2
 1. 看了别人的题解，原来 不需要输出，系统会自动输出，速度慢就慢在了这个输出上····
 2. 去掉输出后，时间很快了
 反思
 其实还有一种异或的神仙解法，但没必要，效率差不多。
 */
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
