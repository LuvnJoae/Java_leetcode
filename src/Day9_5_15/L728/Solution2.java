package Day9_5_15.L728;

import java.util.ArrayList;
import java.util.List;

/**
 * 思路2
 1. 抓门定义一个方法，用于返回一个boolean值，判断是否为自除数。
 2. 方法：
 a. 通过辗转相除的方法，依次判断个十百千位，不需要像思路1单独定义几个变量了
 b. 如果有位为0，或是不满足自除数的条件，直接返回false

 */
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
