public class Account {
   private int number,balance;

    public Account(int number, int balance) {
        this.number = number;
        this.balance = balance;
    }
    public void withdraw(int amount){
        this.balance-=amount;
    }
    public void deposit(int amount){
        this.balance+=amount;
    }

    public int getBalance() {
        return this.balance;
    }
}
