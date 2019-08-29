package Day9_5_15.L292;

/**
 * 思路1
 1. 题目为先手，所以无论什么时候，当该自己的环节时，剩下4个石子，那么就必输无疑。
 当石子个数n为4的倍数时，无论怎么选择，对手总能让剩下的石子为4个。
 */
public class Solution {
    public boolean canWinNim(int n) {
        return ( (n % 4) != 0 );
    }
}
