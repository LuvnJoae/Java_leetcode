package Day1_3_31.L771;
import java.util.Scanner;

/**
 * 思路一：
 *    1. 将J 和 S从字符串转为字符数组；
 *    2. 循环嵌套，对J中每一个字符，都在S中遍历，查找是否存在，同时统计数字
 *    反思
 *    内存占用有点大，用哈希表解决重复字符存储试试；
 *
 */
public class Main1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int n = num(str1,str2);
        System.out.println(n);
    }

    public static int num(String J, String S){
        char[] chsJ = J.toCharArray();
        char[] chsS = S.toCharArray();

        int count = 0;

        for (int i = 0; i < chsJ.length; i++) {
            for (int i1 = 0; i1 < chsS.length; i1++) {
                if (chsJ[i] == chsS[i1]){
                    count++;
                }
            }
        }
        return count;
    }
}
