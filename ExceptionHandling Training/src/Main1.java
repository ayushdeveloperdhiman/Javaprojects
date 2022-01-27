import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        String name="Ayush Dhiman";
        try {
            System.out.println(name.charAt(name.length()));
        }catch (Exception e){
            System.out.println(e);
        }
        Scanner s=new Scanner(System.in);
    }
}
