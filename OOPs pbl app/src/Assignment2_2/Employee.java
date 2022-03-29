package Assignment2_2;

public class Employee extends Person{
    private double annualSalary;
    private int startedYear;
    private String nationalInsuranceNumber;

    public Employee(String name,double annualSalary,int startedYear,String nationalInsuranceNumber){
        super(name);
        this.annualSalary=annualSalary;
        this.startedYear=startedYear;
        this.nationalInsuranceNumber=nationalInsuranceNumber;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public int getStartedYear() {
        return startedYear;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }
}
