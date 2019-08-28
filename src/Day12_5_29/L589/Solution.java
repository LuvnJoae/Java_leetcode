package Day12_5_29.L589;

import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}

/**
 * 采用递归方法
 */
public class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if (root != null){
            list.add(root.val);
            for (Node child : root.children) {
                preorder(child);
            }
        }
        return list;
    }
}
