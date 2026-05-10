//Brute Force
//Find out max sum of subarray elements 
import java.util.*;
class max{
    int maximum(int[] arr,int n){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    maxi=Math.max(sum,maxi);

                }
            }


        }
        return maxi;

    }
}
class maximumsubarr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the array elements");
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        max obj=new max();
        System.out.print(obj.maximum(arr,n));

         


    }
}