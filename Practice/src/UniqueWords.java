import java.util.Scanner;

public class UniqueWords {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=s.nextLine();
        System.out.println(function(str));
    }
    static int function(String str){
        if(str.length()==0){
            return 0;
        }
        int[] f=new int[str.length()];
        for(int i=0;i<str.length();i++){
            f[i]=-1;
        }
        int c=0;
        String[] s=str.split(" ");
        for(int i=0;i< s.length;i++){
            int count=1;
            for(int j=i+1;j<s.length;j++){
                if(s[i].equals(s[j])){
                    count++;
                    f[j]=0;
                }
            }
            if(f[i]!=0){
                f[i]=count;
            }
        }
        for(int i=0;i< s.length;i++){
            if(f[i]==1){
                c++;
            }
        }
        return c;
    }
}
