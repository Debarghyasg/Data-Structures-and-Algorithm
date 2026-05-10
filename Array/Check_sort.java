import java.util.Scanner;
class check{
    boolean checksort(int[] arr,int n){
        int start=arr[0];
        for(int i=1;i<arr.length-1;i++){
            
                if (arr[i]>=arr[i-1]){



                }
                else{
                    return false;
                }

            }
            return true;

        }


    }





public class Check_sort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of term in arrays:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the terms of arrays:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        check obj=new check();
        boolean result=obj.checksort(arr,n);
        System.out.print(result);
        
        


    }
    }

