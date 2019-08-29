package Day4_4_17.L804;

import java.util.HashSet;

/**
 * 思路2
 通过HashSet里元素不能重复的特点进行存储统计
 1. 字母和摩尔码的对应存储，有两种方式
 a. 同思路1，通过HashMap的键值对进行存储
 b. 将摩尔码存储在一个字符串数组内，通过下标（c - ‘a’）来进行对应读取。
 2. 新建一个HashSet，用来存储转换过的摩尔字符串。
 3. 遍历题目给的字符串数组
 a. 对每一个字符串，通过StringBuild的append方法实现摩尔字符叠加。
 4. 将转换过的摩尔字符串，添加到HashSet中
 a. 因为HashSet不能存储重复的元素，所以重复的元素即使加进去了，HashSet的元素个数也不会增加。
 5. 遍历完成后，输出HashSet的长度

 */
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
