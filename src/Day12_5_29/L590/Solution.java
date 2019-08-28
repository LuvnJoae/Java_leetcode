package Day12_5_29.L590;

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

public class Solution {
    ArrayList<Integer> list = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        if (root != null){
            for (Node child : root.children) {
                postorder(child);
            }
            list.add(root.val);
        }
        return list;

    }
}
