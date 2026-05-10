class hello{
    public boolean pal(int i,String s){
        if(i>=s.length()/2){return true;};
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }
        return pal(i+1,s);
    }
}

class string_palindrome {
    public static void main(String[] args) {
        hello obj=new hello();
        String n="Ramam";
        Boolean c=obj.pal(0,n);
        System.out.println(c);
        
        
    }
}