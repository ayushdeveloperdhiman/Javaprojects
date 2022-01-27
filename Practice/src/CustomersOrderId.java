import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CustomersOrderId {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<String> name=new ArrayList<>();
        int n=s.nextInt();
        s.nextLine();

        for(int i=1;i<=n;i++){
            name.add(s.nextLine());
        }
        sort(name);
    }
    public static void sort(ArrayList<String> s){
        Collections.sort(s);
        System.out.println(s);;
    }
}
