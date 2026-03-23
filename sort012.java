import java.util.*;
class sort{
    int[] sort1(int[] arr,int n){
        int i=0;
        int low=i;
        int mid=i;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int c=arr[mid];
                arr[mid]=arr[low];
                arr[low]=c;
                mid++;
                low++;



            }
            else if(arr[mid]==1){mid++;}
            else if(arr[mid]==2){
                int d=arr[mid];
                arr[mid]=arr[high];
                arr[high]=d;

                high--;}
            
            
        }
        return arr;
    }
}
public class sort012 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms of an array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sort obj=new sort();
        obj.sort1(arr,n);
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]); 
        }
        
        

    }
}
