class reverse_a_digit {
    public int reverse(int x) {
        int reverse=0;
        int ld;
        while(x!=0){
            ld=x%10;
            
           if(reverse>Integer.MAX_VALUE/10 || reverse==Integer.MAX_VALUE/10 && ld>7){
            return 0;
           }
           if(reverse<Integer.MIN_VALUE/10 || reverse==Integer.MIN_VALUE/10 && ld<-8){
            return 0;
           }
           x=x/10;
            reverse=(reverse*10)+ld;




        }
        return reverse;
        
    }
}