import java.util.*;
class maxoccur{
    int maxxoccr(int[] arr,int n){
        int count=1;
        int max=1;
        
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;

            }
            if(count>max){
                max=count;
            }
            else {
                count=1;
            }
            

        }
        return max;
    }
}

public class MaxCD {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements in an array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();


        }
        maxoccur obj=new maxoccur();
        int count=obj.maxxoccr(arr,n);
        System.out.println(count);
        

    }
    
}
