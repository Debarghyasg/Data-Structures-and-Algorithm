import java.util.*;
class bubble{
    void b1(int n,int[] arr){
        for(int i=0;i<=arr.length-2;i++){
            for(int j=0;j<=arr.length-2-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
}


public class Bubble_sort {public static void main(String[] args){
    System.out.println("enter the array size ");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr= new int[n];
    System.out.println("enter the array elements ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

    }
        bubble b=new bubble();
        b.b1(n,arr);




    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");

    }

}

    
}
