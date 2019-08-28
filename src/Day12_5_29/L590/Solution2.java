package Day12_5_29.L590;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution2 {
    public List<Integer> postorder(Node root) {

        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Stack<Node> s = new Stack<>();
        s.push(root);
        Node node = root;
        Node child = null;
        while (!s.isEmpty()){
            if ( node.children.size() > 0&& !node.children.contains(child) ){
                for ( int i = node.children.size() - 1; i >= 0 ; i--){
                    s.push(node.children.get(i));
                }
                node = s.peek();
            }else {
                child = s.pop();
                list.add(child.val);
                if (s.isEmpty()) break;
                node = s.peek();
            }
        }
        return list;
    }

}
