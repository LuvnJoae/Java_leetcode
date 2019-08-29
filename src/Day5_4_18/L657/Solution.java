package Day5_4_18.L657;

/**
 * 思路1
 1. 定义两个变量，用来分别存储水平方向上的移动和竖直方向的移动
 a. 规定右和上为正，+1，左和下为负，-1
 2. 对给出的字符串进行字符分离，转换成字符数组，然后遍历
 a. 遍历的同时进行判断，哪个count进行相应运算
 3. 最后如果两个count都是0，则为原点。
 反思
 1. 这样做思路很简单，但是判断太多，影响了运行时间
 2. 看了别人的答案，有一种方法是把判断计数，改成直接用数组的下标进行计数

 */
public class Solution {

    public boolean judgeCircle(String moves) {
        int countX = 0;
        int countY = 0;

        char[] chars = moves.toCharArray();
        for (char c : chars) {
            if ( c == 'U'){
                countY++;
            }else if ( c == 'D'){
                countY--;
            }else if ( c == 'R'){
                countX++;
            }else if ( c == 'L'){
                countX--;
            }else {
                return false;
            }
        }
        if ( countX == 0 && countY == 0){
            return true;
        }else {
            return false;
        }
    }
}
