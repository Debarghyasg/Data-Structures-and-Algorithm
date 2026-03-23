import java.util.*;
class majorityelement{
    int maj(int[] arr,int n){
        int count=0;
        int ele=0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                count=1;
                ele=arr[i];

            }
            else if(arr[i]==ele){
                count++;


            }
            else{
                count--;
            }

        }
            int cin=0;
            for(int i=0;i<arr.length;i++){
             if(arr[i]==ele){
                cin++;

             }
             if(cin>(arr.length/2)){
                return ele;
             }

    }
    return -1;
        

    }


}
public class majorityele2 {
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

