import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        System.out.println("Enter a number upto which you want tables to be printed");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        table(num);
    }
    public static void table(int a){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i+" * "+j+"="+(i*j));
            }
            System.out.println("----------------------------------------------");
        }
    }
}
