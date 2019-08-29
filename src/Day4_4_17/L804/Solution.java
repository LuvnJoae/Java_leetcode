package Day4_4_17.L804;

import java.util.HashMap;

/**
 * 思路1
 通过HashMap的键值对进行存储
 1. 建立HashMap1，对字母和摩尔码进行键值对应存储。
 2. 遍历字符串数组，对其中的每一个字符串进行摩尔转换
 a. 通过toCharArray 和 concat实现
 b. 通过StringBuild的append方法实现
 3. 然后将转换过的摩尔密码用HashMap2存储
 4. 每次转换后，都进行判断，判断是否已经在HashMap中存在
 a. 不存在，则新建一个键值对象
 b. 存在，不做任何改变
 5. 遍历完成后，输出HashMap 的长度。

 */
public class Solution {
    public int uniqueMorseRepresentations(String[] words) {
//      通过哈希表 键值对 的方式存储摩尔密码和字母的关系
        HashMap<Character,String> map1 = new HashMap<>();
        String[] ms = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (int i = 0; i < 26; i++) {
            map1.put((char)('a'+i),ms[i]);
        }
//      遍历字符串数组，对每一个字符串，先进行转成字符数组，然后根据单个字符，
//      和哈希表map1内的键值对象，连接构造出一个摩尔字符串，用新的哈希表map2存储
        HashMap<String,Integer> map2 = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
//      这里也可以通过 StringBuild的append的方法实现，详见思路2的代码
            String temp = new String();
            for (int i1 = 0; i1 < chars.length; i1++) {
                temp = temp.concat(map1.get(chars[i1]));
            }
//      如果没有这个摩尔字符串，给值1，有的话，不进行任何操作。
            if ( !map2.containsKey(temp) ){
                map2.put(temp,1);
            }
        }
//      最后map2中的键值对个数，也就是map2的size，就是答案。
        int count = map2.size();
        return count;
    }
}
