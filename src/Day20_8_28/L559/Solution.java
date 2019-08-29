package Day20_8_28.L559;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Node{
    public int val;
    public List<Node> children;

    public Node(){}
    public Node(int _val, List<Node> _children){
        val = _val;
        children = _children;
    }
}

/**
 * 通过递归方法，类似寻找二叉树最大深度。寻找多叉树最大深度
 */
public class Solution {
    public int maxDepth(Node root){
        if (root == null){
            return 0;
        }else if (root.children.isEmpty()){
            return 1;
        }
        else {
            List<Integer> childCount = new ArrayList<>();
            for (int i = 0; i < root.children.size(); i++) {
                childCount.add(maxDepth(root.children.get(i)));
            }
            ;
            return Collections.max(childCount) + 1;
        }
    }
}

