package Geek_For_Geeks;

public class InsertionInBTree {
    Node root;
    InsertionInBTree(){
        root = null;
    }
    public static void main(String[] args) {
        InsertionInBTree tree = new InsertionInBTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.printInOrder(tree.root);
    }

    public void InOrder(Node root){
        if(root == null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.key+" ");
        InOrder(root.right);
    }

    public void printInOrder(Node root){
        InOrder(root);
    }
}
class Node{
    int key;
    Node left, right;
    Node(int val){
        key = val;
        left = right = null;
    }
}
