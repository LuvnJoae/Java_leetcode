package Day6_4_25.L1021;

/**
 * 思路1
 1. 如果设一个变量count，对非空括号字符串从左向右进行字符遍历，左括号则count +1，右括号则count -1，那么每当count重新为0时，就代表着一次分解，从count=1开始到count=0结束，为一个源语。
 a. 拆分成源语，进行去头去尾操作，然后添加存储在一个StringBuilder里。
 2. 具体：
 a. 设变量count用于分割计数，temp用于标记分割位置，设一个StringBuilder用于存储处理好的字符串。
 b. 转成字符数组，进行遍历
 i. if判断，对count进行+ -
 ii. 再次if判断，count = 0 ，则进行处理
 1) 先分割
 2) 再去头尾
 3) 最后存储添加到StringBuilder里
 c. 转成string，返回
 3. 输出
 反思
 1. 这种计数分割的方法，本质上就是一种模拟进出栈的过程，下面的思路2将用栈的方法解决问题。
 2. 进行遍历和判断的时候，如果字符串转字符数组使用频率很高，不如先定义一个char【】，后面用这个char【】对象进行操作，而不是每一次都S.toCharArray（），这样如果存在大量判断操作，时间和空间都会复杂很多。
 注意String和StringBuilder的区别，还可以扩展一下StringBuffer的用法。
 */
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
