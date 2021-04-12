public class vowels {
    public static void main(String[] args) {
        System.out.println(fun("abcdefghijklmnopqrstuvwxyz"));
        String str="HellO";
        
    }
    static int fun(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        return count;
    }
}
