package Day2_4_2.L709;

import java.util.Scanner;

/**
 * 思路2
 1. 其实都是一样的，只是把if判断，变成了正则表达式；

 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(tra(str));
    }

    public static String tra(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
                chars[i] = ( chars[i] <= 'Z' && chars[i] >= 'A') ? (char)(chars[i] + 32) : chars[i];
        }
        str = new String(chars);
        return str;

    }
}
