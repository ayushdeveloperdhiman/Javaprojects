import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        AccountTransaction ob=new AccountTransaction(sc.nextInt(),sc.nextInt());
        ob.deposit(sc.nextInt());
        System.out.println(ob.getBalance());
        ob.deposit(sc.nextInt());
        System.out.println(ob.getBalance());
        ob.withdraw(sc.nextInt());
        System.out.println(ob.getBalance());
        ob.deposit(sc.nextInt());
        System.out.println(ob.getBalance());
        ob.withdraw(sc.nextInt());
        System.out.println(ob.getBalance());
        System.out.println(ob.getDifference());
        sc.close();
    }
}
