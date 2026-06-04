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

public class getelement {
public static void main(String[] args){

    ArrayList<Integer> arr =new ArrayList<>(Arrays.asList(2,3,8));
    Node y=new Node(arr.get(2),null);
    System.out.println(y.data);
    
}
}