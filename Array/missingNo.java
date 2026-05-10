//Missing Number(optimized)
import java.util.*;
class missing{
    int missing2(int[] arr,int n){
        int sum=arr.length*(arr.length+1)/2;
        int s=0;
        for(int i=0;i<n;i++){
            
            s+=arr[i];

        }
        return s-sum;

    }
}
public class missingNo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the terms in an array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        missing obj=new missing();
        int c=obj.missing2(arr,n);
        System.out.print(c);
        






    }
}