package Day16_6_5.L476;

public class Solution3 {
    public int findComplement(int num) {
        int temp = num;
        int c =0;
        while (num > 0){
            num >>= 1;
            c = (c << 1 ) + 1;
        }
        return temp^ c;
    }
}
