import java.util.*;
class last{
    void lastzero2(int[] arr,int n){
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
                i++;
            }

        }
    }
}

public class Zerolast {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms in array:"); 
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        last obj=new last();
        obj.lastzero2(arr,n);
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);

        }
        




    }
}
