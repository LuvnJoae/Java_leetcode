package Day2_4_2.L709;


import java.util.Arrays;
import java.util.Scanner;

/**
 * 思路1
 1. 将字符串转成字符数组
 2. 进行遍历
 3. 如果是大写字母，ASCII码加32，转成大写字母
 4. 转成字符串
 5. 输出
 收获
 1. 字符数组转换成字符串，两种方式
 a. 通过Arrays工具类，Arrays.toString( 字符数组 )
 b. 通过新建一个String对象，使用有参构造： new String（字符数组）
 c. 二者区别：
 Arrays工具类，虽然转成了字符串，但显示还是字符数组的显示方式；
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(tra(str));
    }

    public static String tra(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] <= 'Z' && chars[i] >= 'A'){
                chars[i] = (char)(chars[i] + 32);
            }
        }
        str = new String(chars);
        return str;

    }
}
