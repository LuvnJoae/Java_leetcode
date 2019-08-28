package Day1_3_31.L771;
import java.util.Scanner;

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
