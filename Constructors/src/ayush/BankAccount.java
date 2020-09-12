package ayush;
public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    public BankAccount(){
        this("12","Ayu","ayush@gmail.com","1235488",25);
    }


    public BankAccount(String accountNumber,String customerName,String email,String phoneNumber,double balance){
        this.accountNumber=accountNumber;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.balance=balance;
    }


    public BankAccount(String customerName, String email, String phoneNumber) {
        this("1582",customerName,email,phoneNumber,1258);
    }

    public void deposit(double depositAmount){
        this.balance+=depositAmount;
        System.out.println("Deposit of "+depositAmount+" made a balance "+this.balance);
    }
    public void withdrawal(double withdrawalAmount){
        if((this.balance-withdrawalAmount)<0){
            System.out.println("Only "+this.balance+" available.Withdrawal not processed");
        }else{
            this.balance-=withdrawalAmount;
            System.out.println("Withdrawal of "+withdrawalAmount+" processed.Remaining balance "+this.balance);
        }
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getEmail(){
        return email;
    }
    public double getBalance(){
        return balance;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }


}
