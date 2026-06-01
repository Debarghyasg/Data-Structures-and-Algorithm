import java.util.*;
class Node{
    int data;
    Node left,right;
    public Node(int item){
        data=item;
     left=right=null;

    }
}

public class postorder {
    Node root;
    void printpostorder(Node node){
        if(node==null){
            return;
        }
        printpostorder(node.left);
        printpostorder(node.left);
        System.out.print(node.data);


    
    
}

    public static void main(String[] args){
        postorder post =new postorder();
        post.root=new Node(1);
        post.root.left=new Node(2);
        post.root.right=new Node(3);
        
        System.out.println("PostOrder traversal of binary tree is: ");
        post.printpostorder(post.root);


    }

}

