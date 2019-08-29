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
/**
 * 思路1
 1. 采用递归思路
 a. 后序遍历，先遍历从左到右的子树，最后输出根节点值
 2. 先定义一个ArrayList
 3. 在方法内
 a. 如果，节点不为空
 i. 先遍历该节点的子树（顺序），递归调用本方法
 ii. 再添加这个节点的值
 b. 最后返回list

 */
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
