package Assignment2_2;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee=new Employee("Ayush Dhiman",3_50_000,2022,"541242");
        System.out.println("\n---------"+employee.getName()+"---------\n"+"\nAnnual Salary :"+employee.getAnnualSalary()
        +"\nStarted Working On :"+employee.getStartedYear()+"\nNational Insurance Number :"+employee.getNationalInsuranceNumber());
    }
}
