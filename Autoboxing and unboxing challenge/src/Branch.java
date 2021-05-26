import java.util.ArrayList;
public class Branch{
    private String name;
    private ArrayList<Customer> customers;
    public Branch(String name){
        this.name=name;
        customers=new ArrayList<>();
    }
    public String getName(){
        return this.name;
    }
    public ArrayList<Customer> getCustomers(){
        return this.customers;
    }
    public boolean newCustomer(String nameOfCustomer,double initialTransaction){
        Customer customer=findCustomer(nameOfCustomer);
        if(customer==null){
            this.customers.add(new Customer(nameOfCustomer,initialTransaction));
            return true;
        }
        return false;
    }
    public boolean addCustomerTransaction(String nameOfCustomer,double transaction){
        Customer customer=findCustomer(nameOfCustomer);
        if(customer!=null){
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }
    public Customer findCustomer(String nameOfCustomer){
        for(int i=0;i<customers.size();i++){
            Customer customer=customers.get(i);
            if(customer.getName().equals(nameOfCustomer)){
                return customer;
            }
        }
        return null;
    }
}
