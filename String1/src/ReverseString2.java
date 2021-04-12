public class ReverseString2 {
    public static void main(String[] args) {
        System.out.println(fun("Hello how are you"));
    }
    static String fun(String str){
        String arr[]=str.split(" ");
        String g="";
        for(int i=arr.length-1;i>=0;i--){
            g=g+arr[i]+" ";
        }
        return g;
    }
}
