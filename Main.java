//Print number 5 times
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        Hi ab=new Hi();
        
        ab.f(a);
    }
}
 class Hi{
    int count=0;
public void f(int num){
    System.out.println("Charlie");
    count++;
    if(count==num){
        return;
    }
    
    f(num);
}
}

