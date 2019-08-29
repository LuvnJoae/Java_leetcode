package Day12_5_29.L590;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 思路2
 1. 采用迭代法，借助 栈 来储存节点，节点按照后序的顺序出入栈
 2. 定义一个ArrayList和栈Stack
 3. 如果节点为空，返回list
 4. 将根节点入栈
 5. 定义一个 node ，作为每次迭代的节点，初始值赋为root
 6. 再定义一个Node  child ，作为存储每次迭代后的子节点（用来判断是否已经遍历过该节点的子节点），初始值赋为null
 7. while循环，栈为空时退出循环
 a. 如果 当前节点 有子节点（size>0） 并且 不包括child节点 （排除已遍历过的）
 i. 循环，反方向遍历 node 节点的子节点
 ii. 循环完成后，将node节点指向当前栈的栈顶
 b. 否则 （代表当前节点已经没有子节点了，要么是最下层，要么就是没有子节点的节点，这时的操作就是将这一层的子节点从左向右的添加到list，添加完成后，栈顶的值就是上一层节点的了，相当于后序遍历）
 i. 将栈顶节点出栈给 child （此时栈顶节点就是 子节点 的最左边的节点）
 ii. 添加此节点的值给list
 iii. 如果此时栈为空，那么break结束循环。
 iv. 否恶则，node等于当前栈顶的值

 */
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
