import java.util.Scanner;

public class Main240 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        char[] id=new char[n];
        for(int i=0;i<id.length;i++){
            id[i]=s.next().charAt(0);
        }
        int count=0;
        for(int i=0;i<id.length;i++){
            if(id[i]=='a'||id[i]=='e'||id[i]=='i'||id[i]=='o'||id[i]=='u'||id[i]=='A'||id[i]=='E'||id[i]=='I'||id[i]=='O'||id[i]=='U'){
                continue;

            }
            count++;
        }
        System.out.println(count);
    }
}
