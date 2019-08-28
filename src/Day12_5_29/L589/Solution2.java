package Day12_5_29.L589;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 利用迭代方法
 *      利用栈，节点按前序的顺序出入栈
 */
public class Solution2 {
    public List<Integer> preorder(Node root) {

        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list;

        Stack<Node> s = new Stack<>();
        s.push(root);
        while (!s.isEmpty()){
            Node n = s.pop();
            list.add(n.val);
            for (int i = n.children.size()-1 ; i >= 0; i--){
                s.push(n.children.get(i));
            }
        }
        return list;
    }
}
