package Day2_4_2.L709;


import java.util.Arrays;
import java.util.Scanner;


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
