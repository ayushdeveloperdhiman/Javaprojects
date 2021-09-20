import java.util.Scanner;

public class OldestProduct {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int barcode=s.nextInt();
        int min=Integer.MAX_VALUE;
        while(barcode!=0){
            int temp=barcode%10;
            if(temp<=min){
                min=temp;
            }
            barcode=barcode/10;
        }
        System.out.println(min);
    }
}
