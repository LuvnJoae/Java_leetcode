package Day9_5_15.L728;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public List<Integer> selfDividingNumbers(int left, int right){
        List<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; i++){
            if (judge(i)){
                list.add(i);
            }
        }
        return list;
    }
    public boolean judge(int i){

        int num = i;
        while (i > 0){
            int m = i % 10;
            if (m == 0){
                return false;
            }
            if (num % m != 0){
                return false;
            }
            i /= 10;
        }
        return true;
    }
}
