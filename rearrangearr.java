//Brute Force
//Find out max sum of subarray elements 
import java.util.*;
class max{
    int[] maximum(int[] arr,int n,int[] re){
        int posindex=0;
        int negindex=1;
        
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]>0){
                re[posindex]=arr[i];
                posindex+=2;

            }
            else{
                re[negindex]=arr[i];
                negindex+=2;

                
            }

        }
        return re;


    }
}
class rearrangearr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the array elements");
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        max obj=new max();
        int[] re=new int[n];
        
        obj.maximum(arr,n,re);
        for(int i=0;i<re.length;i++){
            System.out.print(re[i]+" ");

        }

         


    }
}