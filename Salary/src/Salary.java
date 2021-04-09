public class Salary {
    public static void main(String[] args) {
        calculateSalary(20000,10,"Female");
        calculateSalary(50000,4,"female");
        calculateSalary(10000,2,"female");
        calculateSalary(100000,8,"male");
        calculateSalary(40000,3,"male");
        calculateSalary(20000,1,"male");
    }

    public static void calculateSalary(double currentSalary, int workingYear, String gender) {
        if (gender.toLowerCase() == "female") {
            if (workingYear > 5) {
                double increment = (20.00 / 100.00) * currentSalary;
                System.out.println("Increment given to employee = " + increment);
                System.out.println("Salary after increment = " + (currentSalary + increment));
                System.out.println("");
            }
            if (workingYear >= 3 && workingYear <= 5) {
                double increment = (15.00 / 100.00) * currentSalary;
                System.out.println("Increment given to employee = " + increment);
                System.out.println("Salary after increment = " + (currentSalary + increment));
                System.out.println("");
            }
            if (workingYear < 3) {
                System.out.println("Sorry no increment.");
                System.out.println("");
            }
        }
        if (gender.toLowerCase() == "male") {
            if (workingYear > 5) {
                double increment = (15.00 / 100.00) * currentSalary;
                System.out.println("Increment given to employee = " + increment);
                System.out.println("Salary after increment = " + (currentSalary + increment));
                System.out.println("");
            }
            if (workingYear >= 3 && workingYear <= 5) {
                double increment = (10.00 / 100.00) * currentSalary;
                System.out.println("Increment given to employee = " + increment);
                System.out.println("Salary after increment = " + (currentSalary + increment));
                System.out.println("");
            }
            if (workingYear < 3) {
                System.out.println("Sorry no increment.");
                System.out.println("");
            }
        }
    }
}
