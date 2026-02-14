import java.util.Scanner;
class f3{
    public void f5(int i,int n){
        if(i<1){
            return;
        }
        f5(i-1,n);
        System.out.println(i);
    }

}


public class recursion_backtrack {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      f3 obj=new f3();
      obj.f5(10,11);
     
    
}
}