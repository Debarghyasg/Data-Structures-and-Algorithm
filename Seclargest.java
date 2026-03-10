//Find largeselement in an array
//Time complexity is O(n) and space complexity is O(1)

import java.util.*;
class large{
    int largest(int arr[],int n){
        int Second_largest=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>Second_largest){
                for(int j=0;j<n;j++){
                    if(arr[j]>Second_largest && arr[j]<arr[i]){
                        Second_largest=arr[j];
                    }
                }
            }
        }
        return Second_largest;
    }
    int smallest(int[] arr,int n){
        int Ssmallest=arr[0];
                for(int i=0;i<arr.length;i++){
                    if(arr[i]<Ssmallest);
                    
                for(int j=0;j<n;j++){
                    if(arr[j]<Ssmallest && arr[j]>arr[i])
                        {
                        Ssmallest=arr[j];
                    }
                }
            }
            return Ssmallest;
            }

        }

    




public class Seclargest {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the array size ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the array elements ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    large obj=new large();
    int result=obj.largest(arr, n);
    int result2=obj.smallest(arr,n);
    System.out.println("the largest element is "+result+"  "+"second smallest is "+result2);
    
    
    
}
}

