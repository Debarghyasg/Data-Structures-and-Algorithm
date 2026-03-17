//i have to find out if pair of numbers are given in an array the find number which occurs only once
//I/P-[1,1,2,3,3]   O/P-2

import java.util.*;
class appear {
    int findSingle(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num; // XOR every element
        }
        return result;
    }
}

public class appear_once2 {
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
    System.out.print("Number which appears once is=");

    int c=obj.findSingle(arr);
    System.out.println(c);


}
    
}
