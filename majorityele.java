//Find which element appears more than n/2 times
import java.util.*;
class majorityelement{
    int maj(int[] arr,int n){
        int count=0;
        int max=arr.length/2;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                if(count>max){
                    return count;
                }
            }

        }

        return -1 ;
    }

}
public class majorityele {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms in an array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        majorityelement obj=new majorityelement();
        int c=obj.maj(arr,n);
        System.out.println(c);
        


    }
}
