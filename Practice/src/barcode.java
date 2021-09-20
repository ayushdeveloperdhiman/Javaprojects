import java.util.Scanner;

public class barcode {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String barcode="";
        while(n!=0){
            int temp=(n%10)+97;
            barcode+=(char)temp;
            n=n/10;
        }
        for(int i=barcode.length()-1;i>=0;i--){
            System.out.print(barcode.charAt(i));
        }
    }
}
