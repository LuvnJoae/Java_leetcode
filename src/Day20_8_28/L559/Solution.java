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
 * 思路一
 1. 采用递归方式，类似寻找二叉树的最大深度
 2. 注意，和二叉树最大深度不同，多叉树的子树是通过List的形式进行存储的，所以在判断递归结束条件时，条件是List为空，而不是节点为null，节点为null只对应了给的root节点为null时的情况。
 反思
 1. 时间复杂度O（N），空间复杂度O（logN）（最优平衡时）
 2. 消耗资源过多，且递归占用的时间也很长。
 3. 对于List形式的多叉树的子树列表，判断是否为空，即没有子树，应该用方法.isEmpty（）来判断，而不是==null的形式
 a. 两种判断方式的区别：https://blog.csdn.net/u011109881/article/details/50635247
 ii. 即：创建对象时就给了null值，则使用null判断
 iii. 新建一个对象，但是没有给值，则使用isEmpty判断（新建时给了初始对象，不是null）

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

