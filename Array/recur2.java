//Print number from N to 1
import java.util.Scanner;
public class recur2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        hello abc=new hello();
        int c=sc.nextInt();
        abc.main(c);


    }
}
class hello{
    
    public void main(int n){
        int a=n;
        a--;
        if(a==0){
            return;
        }
        System.out.println(a);
        main(a);

    }
}
