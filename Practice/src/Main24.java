import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main24 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Integer[] num = new Integer[n];
        for(int i=0;i< num.length;i++){
            num[i]=s.nextInt();
        }
        int min = Collections.min(Arrays.asList(num));
        int max = Collections.max(Arrays.asList(num));
        System.out.println("Minimum "
                + min);
        System.out.println("Maximum "
                + max);
    }

}