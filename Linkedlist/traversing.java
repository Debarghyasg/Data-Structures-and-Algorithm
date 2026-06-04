package Linkedlist;
import java.util.*;
class Node{
    int data;
    Node next;
    public Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class traversing{
    private static Node traversing2(int[] arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;

    }
    public static void main(String[] args){
        int[] arr={2,3,4,5};
        Node head= traversing2(arr);
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
        }

    }

}

