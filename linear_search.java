import java.util.*;


public class linear_search{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] marks=new int[n];
        System.out.println("Enter array");
        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<marks.length;i++){
            System.out.print("["+marks[i]+"]");
        }
        //enter input
        System.out.println(" ");
        
        System.out.println("Enter desired number");
        int target=sc.nextInt();
        hello ab=new hello();
        System.out.println(ab.hi(marks,target));
        
        
        
        
        
    }
}

class hello{
    public Boolean hi(int marks[],int target){
        for(int i=0;i<marks.length;i++){
            if(target==marks[i]){
                return true;
                
            }}
            return false;
            
            
        
    }
}