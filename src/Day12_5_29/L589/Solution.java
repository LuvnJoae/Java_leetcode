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
 * 思路1
 1. 采用递归思路
 a. 前序遍历，先根节点的值，再从左到右遍历
 2. 先定义一个ArrayList
 3. 在方法内
 a. 如果，节点不为空
 i. 先添加这个节点的值
 ii. 再遍历该节点的子树（顺序），递归调用本方法
 b. 最后返回list

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
