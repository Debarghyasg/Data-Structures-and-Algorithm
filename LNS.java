import java.util.Scanner;
class searching{
    int search(int[] arr,int n,int d){
        for(int i=0;i<n;i++){
            if(arr[i]==d){
                return i;
                
            }


        }
        return -1;
    }
}


public class LNS {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms in an array:");
        int n=sc.nextInt();
        System.out.println("Enter the array:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the searched number:");
        int d=sc.nextInt();
        searching obj=new searching();
        int c=obj.search(arr,n,d);
        System.out.println(c);


    }
}
