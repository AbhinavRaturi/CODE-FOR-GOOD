package Geek_For_Geeks;

import java.util.LinkedList;
import java.util.Queue;

public class CountLeaveNode {
    public static void main(String[] args) {
        Node rootNode = new Node(1);
        rootNode.left = new Node(2);
        rootNode.right = new Node(3);
        rootNode.left.left = new Node(4);
        rootNode.left.right = new Node(5);
        rootNode.right.left = new Node(6);
        rootNode.right.right = new Node(7);
        //                           1
        //                         /   \
        //                        2     3
        //                       / \   / \
        //                      4   5  6  7
        CountLeaveNode tree = new CountLeaveNode();
        System.out.println(tree.countLeaves(rootNode));
    }

    int countLeaves(Node node) {
        int counter = 0;
        Queue<Node> nQueue = new LinkedList<Node>();
        nQueue.add(node);
        while (!nQueue.isEmpty()) {
            Node temp = nQueue.poll();
            if (temp.left == null && temp.right == null)
                counter++;
            if (temp.left != null)
                nQueue.add(temp.left);
            if (temp.right != null)
                nQueue.add(temp.right);
        }
        return counter;
    }
}

class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}