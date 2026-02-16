import java.util.*;
public class hashmap {
    
    public static void main(String[] args){
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        int[] hash=new int[13];
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]+=1;
        }
        
       
        
        
        System.out.println("Enter the number you want to search:");
        int z=sc.nextInt();
        while(z-->0){
            int number=sc.nextInt();
            // System.out.println(number);
            System.out.println("Occurence are:");
            
            System.out.println(hash[number]);
        }
        
        
    }
    
}