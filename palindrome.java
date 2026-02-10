public class palindrome {
    public boolean isPalindrome(int x) {
        int duplicate=x;
        int revd=0;
        if(x<0){
            return false;
        }
        while(x!=0){
            int lastdigit=x%10;
            if(revd>Integer.MAX_VALUE/10 || revd==Integer.MAX_VALUE/10 && lastdigit >7){
            return false;
        }
         if(revd<Integer.MIN_VALUE/10 || revd==Integer.MIN_VALUE/10 && lastdigit <-8){
            return true;
        }

            x=x/10;
            revd=(revd*10)+lastdigit;

        }
        
        if(revd==duplicate){
            return true;
        }
        else if(revd<0){
            return true;
        }
        else{
            return false;
        }
        
    }
}


