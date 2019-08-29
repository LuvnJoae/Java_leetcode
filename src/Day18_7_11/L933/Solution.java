package Day18_7_11.L933;

import java.util.*;

/**
 * 思路1
 使用列队保存请求到达时间，因为保证每次对 ping 的调用都使用比之前更大的 t 值，所以每次请求将t-3000之前的值出队列，t入队列，队列长度就是返回值
 [t - 3000, t] 为闭合区间，所以队列大写需要包含t以及t-3000，也就是说出队列条件为t-q.peek>3000,例如3001ms,peek为1ms，所以包含在队列中的值为1,100,3001，结果是3

 */
class Solution {
    private Queue<Integer> q = new LinkedList<>();;
    public Solution() {
    }

    public int ping(int t) {
        while (!q.isEmpty() && t-q.peek()>3000) {
            q.poll();
        }
        q.offer(t);
        return q.size();
    }
}
