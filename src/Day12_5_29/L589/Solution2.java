package Day12_5_29.L589;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 	1. 采用迭代法，借助 栈 来储存节点，节点按照前序的顺序出入栈
 2. 定义一个ArrayList和栈Stack
 3. 如果节点为空，返回list
 4. 将根节点入栈
 5. while循环，栈空时退出循环
 a. 出栈一个节点，为node节点
 b. 将该节点的值添加到list
 c. 循环，反方向遍历node的子节点
 i. 将子节点入栈（这个入栈顺序，出来后，就是前序遍历）
 6. 返回list

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
