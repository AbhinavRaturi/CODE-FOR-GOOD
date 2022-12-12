package Geek_For_Geeks;

public class BinaryTreeTraversal {
    Node root;
    BinaryTreeTraversal(){
        root = null;
    }
    public static void main(String[] args) {
        BinaryTreeTraversal tree = new BinaryTreeTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.printiInOrder(tree.root);
        tree.printPreOrder(tree.root);
        tree.printpostOrder(tree.root);
        
    }

    public void postOrder(Node root){
        if(root ==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.key+" ");
    }

    public void InOrder(Node root){
        if(root ==null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.key+" ");
        InOrder(root.right);
    }

    public void preOrder(Node root){
        if(root ==null){
            return;
        }
        System.out.print(root.key+ " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void printpostOrder(Node root){
        System.out.print("Post Order: ");
        postOrder(root);
        System.out.println();
    }

    void printiInOrder(Node root){
        System.out.print("In Order  : ");
        InOrder(root);
        System.out.println();
    }
    
    void printPreOrder(Node root){
        System.out.print("Pre Order : ");
        preOrder(root);
        System.out.println();
    }
}

class Node{
    int key;
    Node left, right;
    public Node(int d){
        key = d;
        left = right = null;
    }
}