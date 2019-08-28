package Day18_7_11.L933;

import java.util.*;

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
