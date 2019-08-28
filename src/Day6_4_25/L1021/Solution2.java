package Day6_4_25.L1021;

import java.util.Stack;

public class Solution2 {
    public String removeOuterParentheses(String S) {
//      可变字符串、栈对象的创建、字符串转字符数组
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        char[] chars = S.toCharArray();
//      遍历
        for (char c : chars) {
            if (c == '('){
//              先检测是否为空，不是则添加字符，目的就是  去头尾。
                if (!stack.empty()){
                    sb.append('c');
                }
//              入栈 （ ，也只入栈这个，如果是 ），就代表需要出栈（抵消思路）
                stack.push('(');
            }else if (c == ')'){
//              不为空则代表栈顶有元素，即有 （，那么就出栈（抵消）
                if (!stack.empty()) {
                    stack.pop();
                }
//              出栈后再次判断，还不为空，则添加 ）,为空代表着这是最后的）,也就是分割点
                if (!stack.empty()){
                    sb.append(')');
                }
            }
        }
        return sb.toString();
    }
}
