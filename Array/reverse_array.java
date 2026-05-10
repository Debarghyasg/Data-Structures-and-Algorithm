import java.util.Scanner;
class reverse{
    int[] reverse_array(int[] arr,int n){
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        return arr;

        

    }
}
public class reverse_array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms in Array=");
        int n=sc.nextInt();
        System.out.println("Enter terms of Array=");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        reverse obj=new reverse();
        int[] r=obj.reverse_array(arr,n);
        for(int i=0;i<n;i++)
            { 
                System.out.print(r[i]);
            

        }
        




    }
}
