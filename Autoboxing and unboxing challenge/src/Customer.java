import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;
    public Customer(String name,double initialTransactionAmount){
        this.name=name;
        this.transactions=new ArrayList<>();
        this.transactions.add(initialTransactionAmount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
    public void addTransaction(double transaction){
        this.transactions.add(transaction);
    }
}
