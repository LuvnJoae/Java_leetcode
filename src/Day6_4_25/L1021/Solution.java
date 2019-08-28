package Day6_4_25.L1021;

public class Solution {
    public String removeOuterParentheses(String S) {
//      变量count用于计数以分割，temp用于标记分割位置
        int count = 0;
        int temp = 0;
//      用可变字符串StringBuilder，把分割好的字符串添加进去。
        StringBuilder sb = new StringBuilder();
//      转成字符数组，进行遍历
        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
//          进行识别计数，count=0代表着一次分割
            if (chars[i] == '(') {
                count++;
            } else if (chars[i] == ')') {
                count--;
            }
//          先分割，再去头尾，最后添加到StringBuilder里
            if (count == 0) {
                String string = S.substring(temp, i + 1);
                temp = i + 1;
                sb.append(string.substring(1, string.length() - 1));
            }
        }
        return sb.toString();
    }
}
