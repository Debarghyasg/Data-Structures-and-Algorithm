import java.util.*;
class java{
    void app(int[] arr,int n){
        int maxi=Integer.MIN_VALUE;
        List<Integer> result = new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>maxi){
                maxi=arr[i];
                result.add(maxi);
            }
        }
        Collections.reverse(result);
        System.out.println("The leaders are: " + result);



        
        

    }
    
}


class leaders{
public static void main(String[] args){
    System.out.println("Enter the no of terms in an array=");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    java obj=new java();
    obj.app(arr,n);



}
}