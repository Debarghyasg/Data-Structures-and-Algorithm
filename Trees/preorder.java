class Node{
    int data;
    Node left,right;
    public Node(int item){
        data=item;
         left=right=null;

        
    }
}
public class preorder{
    Node root;
    void preorder2(Node node){
        if(node==null){
        return;
    }
    System.out.print(node.data);
    preorder2(node.left);
    preorder2(node.right);

    }
    public static void main(String[] args){
        preorder tree=new preorder();
        tree.root=new Node(1);

        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        System.out.println("The binary tree is:");
        tree.preorder2(tree.root);



    }

}