import java.util.*;
class Node{
    int data;
    Node left,right;
    public Node(int item){
        data=item;
        left=right=null;

    }
}
public class inorder2 {
    Node root;
    void inorder3(Node node){
        if(node==null){
            return;
        }
    inorder3(node.left);
    System.out.print(node.data);
    inorder3(node.right);



    }

    public static void main(String[] args){
        inorder2 tree=new inorder2();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(5);
        tree.inorder3(tree.root);

    }
}


