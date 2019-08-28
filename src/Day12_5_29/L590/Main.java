package Day12_5_29.L590;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Node n5 = new Node(5,null);
        Node n6 = new Node(6,null);
        ArrayList<Node> nodes = new ArrayList<>();
        nodes.add(n5);
        nodes.add(n6);
        Node n3 = new Node(3,nodes);
        Node n2 = new Node(2,null);
        Node n4 = new Node(4,null);
        ArrayList<Node> nodes2 = new ArrayList<>();
        nodes2.add(n3);
        nodes2.add(n2);
        nodes2.add(n4);
        Node n1 = new Node(1,nodes2);

        Solution2 solution2 = new Solution2();
        ArrayList<Integer> list= (ArrayList<Integer>) solution2.postorder(n1);
        System.out.println(list);
    }
}
