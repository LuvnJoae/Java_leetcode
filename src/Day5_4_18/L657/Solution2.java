package Day5_4_18.L657;

/**
 * 思路2
 1. 定义一个大小为26的数组count（26个字母），利用大写字母的ASCII码，进行判断计数
 2. 转成字符数组，进行遍历
 a. 每一次计数，关键语句： count[c - 'A']++;
 b. 其实就是把UDRL这几个字母的值在数组中相应的位置进行计数。
 3. 最后比较UD，RL的值是否相等，返回结果
 反思
 1. 这种方法省去了四个判断语句，因而提高了运行速度，但是空间还是降不下来。

 */
public class Solution2 {
    public boolean judgeCircle(String moves) {
        int[] count = new int[26];
        for (char c : moves.toCharArray()) {
            count[c - 'A']++;
        }
        return count['L' - 'A'] == count['R' - 'A'] && count['U' - 'A'] == count['D' - 'A'];

    }
}
