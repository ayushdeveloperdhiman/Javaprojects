public class palindromeString {
    public static void main(String[] args) {
        System.out.println(fun("nitin"));
    }
    static boolean fun(String str){
        String g="";
        for(int i=str.length()-1;i>=0;i--){
            g=g+str.charAt(i);
        }
        if(g.equals(str)){
            return true;
        }
        return false;
    }
}
