import java.util.*;
class merge{
    void hello(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        hello(arr,low,mid);
        hello(arr,mid+1,high);
        merge2(arr,low,mid,high);
        
        

        }
        void merge2(int arr[],int low,int mid,int high){
            int[] temp=new int[high-low+1];
            int left=low;
            int right=mid+1;
            while(left<=mid && right<=high){
                if(arr[left]<=arr[right]){
                    temp[left-low]=arr[left]; //check
                    left++;
                }
                else{
                    temp[right-low]=arr[right]; //check
                    right++;
                }}
                while(left<=mid){
                    temp[left-low]=arr[left]; //check
                    left++;
                }
                while(right<=high){
                    temp[right-low]=arr[right]; //check
                    right++;
                }
                        for(int i=low;i<=high;i++){
                            arr[i]=temp[i-low]; //check
                        }
                        
                        
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            }

        }

    }







public class mergesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        
        int n=sc.nextInt();
        int[] arr=new int[n];
        // Input array elements
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();}

        //show array
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }

        merge m=new merge();
        m.hello(arr,0,arr.length-1);
        }


    }


