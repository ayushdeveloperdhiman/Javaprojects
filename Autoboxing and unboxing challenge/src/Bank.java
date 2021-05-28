import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;
    public Bank(String nameOfTheBank){
        this.name=nameOfTheBank;
        this.branches=new ArrayList<>();
    }
    public boolean addBranch(String nameOfTheBranch){
        Branch branch=findBranch(nameOfTheBranch);
        if(branch==null){
            branch=new Branch(nameOfTheBranch);
            this.branches.add(branch);
            return true;
        }
        return false;
    }
    public boolean addCustomer(String nameOfTheBranch,String nameOfTheCustomer,double initialTransaction){
        Branch branch=findBranch(nameOfTheBranch);
        if(branch!=null){
            return branch.newCustomer(nameOfTheCustomer,initialTransaction);
        }
        return false;
    }
    public boolean addCustomerTransaction(String nameOfTheBranch,String nameOfTheCustomer,double transaction){
        Branch branch=findBranch(nameOfTheBranch);
        if(branch!=null){
            return branch.addCustomerTransaction(nameOfTheCustomer,transaction);
        }
        return false;
    }
    private Branch findBranch(String nameOfTheBranch){
        for(int i=0;i<branches.size();i++){
            Branch branch=branches.get(i);
            if(branch.getName().equals(nameOfTheBranch)){
                return branch;
            }
        }
        return null;
    }
    public boolean listCustomers(String nameOfTheBranch,boolean printTransactions) {
        Branch branch = findBranch(nameOfTheBranch);
        if (branch!=null && printTransactions) {
            System.out.println("Customers details for branch " + branch.getName());
            for (int i = 0; i < branch.getCustomers().size(); i++){
                System.out.println("Customer: " + branch.getCustomers().get(i).getName() + "[" + (i + 1) + "]");
                System.out.println("Transactions");
                for (int j = 0; j < branch.getCustomers().get(i).getTransactions().size(); j++) {
                    System.out.println("[" + (j + 1) + "]" + " Amount " + branch.getCustomers().get(i).getTransactions().get(j));
                }
            }
            return true;
        } else if (branch!=null && printTransactions==false) {
            System.out.println("Customers details for branch " + branch.getName());
            for (int i = 0; i < branch.getCustomers().size(); i++) {
                System.out.println("Customer: " + branch.getCustomers().get(i).getName() + "[" + (i + 1) + "]");
            }
            return true;
        }
        return false;
    }
}
