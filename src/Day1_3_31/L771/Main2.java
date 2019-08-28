package Day1_3_31.L771;
import java.util.HashMap;
import java.util.Scanner;

public class Main2 {
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

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < chsS.length; i++) {
            if (map.containsKey(chsS[i])){
                map.put( chsS[i], map.get(chsS[i]) + 1);
            }else{
                map.put(chsS[i], 1);
            }
        }
        int count = 0;

        for (int i = 0; i < chsJ.length; i++) {
            if (map.containsKey(chsJ[i])){
                count += map.get(chsJ[i]);
            }
        }
        return count;



    }
}
