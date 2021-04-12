public class ReverseString {
    public static void main(String[] args) {
        System.out.println(fun("Hello how are you"));
    }
    static String fun(String str){
        String arr[]=str.split(" ");
        String g="";
        for(int i=0;i<arr.length;i++){
            String s=arr[i];
            for(int j=s.length()-1;j>=0;j--){
                g=g+s.charAt(j);
            }
            g=g+" ";
        }
        return g;
    }
}
