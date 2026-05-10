import java.util.*;
class selection{
    void s2(int n,int[] arr){
        for(int i=0;i<=arr.length-2;i++){
            int mmi=i;
            for(int j=i;j<=arr.length-1;j++){
                if(arr[j]<arr[mmi]){
                    mmi=j;
                   int temp=arr[i];
                      arr[i]=arr[j];
                      arr[j]=temp;
                    
                }
            }



        }
        

    }

    }



public class Selection_sort {
    public static void main(String[] args) {
    System.out.println("enter the array size ");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr= new int[n];
    System.out.println("enter the array elements ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

    }
     selection s=new selection();
     s.s2(n,arr);



    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");

    }

}
}
