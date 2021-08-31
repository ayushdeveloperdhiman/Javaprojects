public class AccountTransaction extends Account{
private int maxBalance=0;
private int minBalance=0;
    public AccountTransaction(int number, int balance) {
        super(number, balance);
        maxBalance=balance;
        minBalance=balance;
    }
    public void deposit(int amt){
        int balance=super.getBalance()+amt;
        if(maxBalance<balance) {
            maxBalance = balance;
        }
        super.deposit(amt);
    }
    public void withdraw(int amt){

        int balance=super.getBalance()-amt;
        if(minBalance>balance){
            minBalance=balance;
        }
        super.withdraw(amt);
    }
public int getDifference(){
        return maxBalance-minBalance;
}
}
