//i have to find out if pair of numbers are given in an array the find number which occurs only once
//I/P-[1,1,2,3,3]   O/P-2
//valid if they are next to each other
import java.util.*;
class appear{
    int appear2(int[] arr,int n){
        int i=0;
        for(int j=i+1;j<n-1;j++){
            if (arr[j]==arr[i]){
                i++;
            
            }
            else{
                return j;
            }
        }
        return 0;

    }
}
public class appear_once {
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the terms of an array:");
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    appear obj=new appear();
    System.out.print("Number which appears once is");

    System.out.println(obj.appear2(arr,n));


}
}
