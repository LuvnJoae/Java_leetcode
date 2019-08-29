package Day9_5_15.L728;

import java.util.ArrayList;
import java.util.List;

/**
 * 思路1
 1. 将每一位都分开，得到每一位的数。再通过条件判断区分是否为自除数
 2. 从left，到right遍历
 a. 定义 ge shi bai qian 变量，分别存储 个十百千位。
 b. 判断，其中任意一位为0，且数字大小超出这个位数，则直接跳过本次循环。
 c. 分别判断 i在10内，100内，1000内时，是否为自除数。
 反思
 1. 逻辑判断太复杂，有更简单的判断条件，可以用while直接判断各十百千位，见思路2
 */
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
