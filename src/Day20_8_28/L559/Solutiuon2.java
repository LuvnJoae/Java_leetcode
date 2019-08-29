package Day20_8_28.L559;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 思路二
 1. 采用迭代的方法，通过通过队列或者栈的出入操作，模拟递归，并记录下每个节点对应的depth。
 反思
 1. 时间复杂度O（N），空间复杂度O（N）
 2. 也没有节省下多少的东西，空间复杂度反而更高了（理想条件下）

 */
public class Solutiuon2 {
    public int maxDepth(Node root){
        Queue<Pair<Node, Integer>> queue = new LinkedList<>();
        if (root != null){
            queue.add(new Pair(root, 1));
        }

        int depth = 0;
        while (!queue.isEmpty()){
            Pair<Node, Integer> currentNode = queue.poll();
            root = currentNode.getKey();
            depth = depth > currentNode.getValue() ? depth : currentNode.getValue();
            for (Node child : root.children) {
                queue.add(new Pair<>(child, currentNode.getValue()+1));
            }
        }
        return depth;
    }
}
