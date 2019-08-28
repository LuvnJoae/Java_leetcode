package Day17_7_9.L500;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public String[] findWords(String[] words) {
        if (words == null){
            return null;
        }
        String[] str = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        HashMap<Character, Integer> map= new HashMap<>();

        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < str[i-1].length(); j++) {
                map.put(str[i-1].toCharArray()[j], i);
            }
        }

        int temp;
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {

            String word = words[i].toLowerCase();
            temp = map.get(word.toCharArray()[0]);

            for (int i1 = 0; i1 < word.length(); i1++) {
                if (map.get(word.toCharArray()[i1]) == temp)
                    if (i1 == word.length()-1){
                        list.add(words[i]);
                    }else
                        continue;
                else
                    break;
            }
        }
        return  list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        String[] str = {"Hello","Alaska","Dad","Peace"};
        System.out.println(new Solution().findWords(str));



    }

}
