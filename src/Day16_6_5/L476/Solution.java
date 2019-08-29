package Day16_6_5.L476;

/**
 * 思路1
 1. 三个思路都是通过与1异或的方法去实现的，关键就在于怎样去寻找这个异或对象的大小
 2. 通过Integer.toBinaryString（）方法，将数字转成二进制字符串
 3. 根据字符串长度l，设置一个2^l-1大小的数字，其二进制表示就长度未L的11111···
 4. 返回  这个数字与原数字的异或值即可。
 反思
 1. 用了Integer.toBinaryString（）和Math.pow（）两个方法，有点麻烦，直接通过移位来寻找该数字。

 */
public class Solution {
    public int findComplement(int num) {
        //与每一位都是1的数字异或即可。
        String s = Integer.toBinaryString(num);
        double a = Math.pow(2, s.length()) - 1;
        return (int)a ^ num;
    }
}
