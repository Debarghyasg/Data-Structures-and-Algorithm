import java.util.*;
class union{
    Set<Integer> uni(int[] arr1,int[] arr2,int n){
        Set<Integer> hello=new HashSet<>();
        for(int i=0;i<n;i++){
            hello.add(arr1[i]);
        }
        for(int i=0;i<n;i++){
            hello.add(arr2[i]);
        }
        return hello;
    }
}

public class unionarr {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of terms in an array:");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        System.out.println("Enter the array1:");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int[] arr2=new int[n];
        System.out.println("Enter the array1:");
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        union obj=new union();
        Set<Integer> c=obj.uni(arr1,arr2,n);
        System.out.println(c);



    }
}
