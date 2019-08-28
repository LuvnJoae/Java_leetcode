package Day9_5_15.L728;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++){
            int ge = i % 10;
            int shi = (i % 100) / 10;
            int bai = (i % 1000) / 100;
            int qian = i / 1000;
            if (ge == 0 || (shi == 0 && i > 10) || (bai == 0 && i > 100)|| (qian == 0 && i > 1000)){
                continue;
            } else if (i>1000 && (i % qian == 0 && i % bai ==0 && i % shi ==0 && i % ge == 0)){
                list.add(i);
                continue;
            } else if (i>100 && i<1000 && (i % bai == 0 && i % shi == 0 && i % ge == 0)){
                list.add(i);
                continue;
            } else if (i>10 && i<100 &&( i % shi ==0 && i % ge == 0) ){
                list.add(i);
                continue;
            } else if (i<10){
                list.add(i);
            }
        }
        return list;
    }
}
