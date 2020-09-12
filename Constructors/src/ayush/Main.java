package ayush;
public class Main {

    public static void main(String[] args) {
        BankAccount defaultu=new BankAccount();
        System.out.println(defaultu.getAccountNumber());
        BankAccount ayushAccount = new BankAccount("12345","Ayush Dhiman","Ayushdeveloper0711@gmail.com","7018515995",1000);
        ayushAccount.withdrawal(100);

        ayushAccount.deposit(50);
        ayushAccount.withdrawal(100);

        ayushAccount.deposit(51);
        ayushAccount.withdrawal(100);

        BankAccount aditya=new BankAccount("Aditya","kdh","5555");
        System.out.println(aditya.getAccountNumber());
        System.out.println(aditya.getBalance());
    }
}
