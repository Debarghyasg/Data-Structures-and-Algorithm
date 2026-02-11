//Print number N times
import java.util.Scanner;
public class recur{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        Hi ab=new Hi();
        
        ab.f(a);
    }
}
 class Hi{
    int count=1;
public void f(int num){
    System.out.println(count);
    
    if(count==num){
        return;
    }
    count++;
    
    f(num);
}
}

