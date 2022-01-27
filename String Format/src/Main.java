public class Main {
    public static void main(String[] args) {
        for(int i=2;i<11;i++){
            System.out.println("10000.00 at "+i+" interest is "+String.format("%.2f",calculateInterest(10000,i)));
        }
    }
    public static double calculateInterest(double amount,double interestRate){
        return (amount * (interestRate/100));
    }
}
