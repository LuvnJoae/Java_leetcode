package Day4_4_17.L804;

import java.util.HashSet;

public class Solution2 {
    public int uniqueMorseRepresentations(String[] words) {
//      直接通过一个字符串数组存储摩尔码，对应读取的话用字符串数组下标。
        String[] strs = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
//      建立哈希表，利用哈希表元素不重复的特点。
        HashSet<String> set = new HashSet<>();
        for (String word : words) {
//      StringBuilder可改变长度，而且apend方法很好用，可以直接在原StringBuilder上追加。
//      就相当于 String 在自身上 concat的方法，而且更省空间。
            StringBuilder sB = new StringBuilder();
            for (char c : word.toCharArray()) {
                sB.append(strs[c - 'a']);//用下标读取对应摩尔码
            }
            set.add(sB.toString());//定义的Set里是String类型，所以要转换一下
        }

        int count = set.size();
        return count;
    }
}
