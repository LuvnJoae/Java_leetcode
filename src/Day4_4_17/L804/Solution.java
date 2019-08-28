package Day4_4_17.L804;

import java.util.HashMap;

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
