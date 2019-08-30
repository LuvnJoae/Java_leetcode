package Day20_8_28.L559;

/**
 * 思路三
 1. 还是递归的思路，不过对实现方式进行了优化
 2. 用一个max变量进行最大值的存储，进行实时替换，而不是用列表来挨个存取
 3. 这样对于判断列表是否为空的情况，由于不需要再通过下标访问列表内容，而且不需要再新建一个列表，所以避免了对列表的判断为空的问题
 4. 只需要对节点进行非空判断即可。
 反思
 1. 虽然时间复杂度都是一样的（和思路一），但是避免了在递归过程中大量新建列表或者调用排序方法，因此节省了大量的时间和空间。

 */
public class Solution3 {
    public int maxDepth(Node root){
        if (root == null){
            return 0;
        }
        int max = 0;
        int depth = 0;
        for (Node child : root.children) {
            depth = maxDepth(child);
            max = max < depth ? depth : max;
        }
        System.out.println("sad");
        System.out.println("asd21");
        return max + 1;
    }
}

