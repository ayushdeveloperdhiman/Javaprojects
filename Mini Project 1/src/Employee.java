public class Employee {
    private int[] empNo = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
    private String[] empName = {"Ashish", "Sushma", "Rahul", "Chahat", "Rnajan", "Suman", "Tanmay"};
    private String[] joinDate = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "1/1/2000", "12/06/2006"};
    private char[] designationCode = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
    private String[] department = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
    private int[] basic = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
    private int[] hra = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
    private int[] it = {3000, 9000, 1000, 2000, 20000, 4400, 10000};
    private String designation = null;

    private int searchEmployee(int empNumber) { //search employee if found then return index, else return -1
        for (int i = 0; i < empNo.length; i++) {
            if (empNo[i] == empNumber) {
                return i;
            }
        }
        return -1;
    }

    public String getName(int id){
        return empName[searchEmployee(id)];
    }

    public String getDepartment(int id){
        return department[searchEmployee(id)];
    }

    private int calDa(int index) {
        char ch = designationCode[index];
        switch (ch) {
            case 'e':
                designation = "Engineer";
                return 20000;

            case 'c':
                designation = "Consultant";
                return 32000;

            case 'k':
                designation = "Clerk";
                return 12000;

            case 'r':
                designation = "Receptionist";
                return 15000;

            case 'm':
                designation = "Manager";
                return 40000;

        }
        return 0;
    }

    private String getDesignation(int index) {
        char ch = designationCode[searchEmployee(index)];
        switch (ch) {
            case 'e':
                return  "Engineer";

            case 'c':
                return "Consultant";

            case 'k':
                return "Clerk";

            case 'r':
                return  "Receptionist";

            case 'm':
                return "Manager";


        }
        return null;
    }

    private int calculateSalary(int id) {

        int index = searchEmployee(id);
        return basic[index] + hra[index] + calDa(index) - it[index];

    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.exit(1);
        } else {
            Employee emp = new Employee();
            int emp_id = Integer.valueOf(args[0]);
            if (emp.searchEmployee(emp_id) != -1) {
                System.out.println("Emp No.    Emp Name    Department    Designation    Salary");
                System.out.printf("%7d    ", emp_id);
                System.out.printf("%8s    ", emp.getName(emp_id));
                System.out.printf("%10s    ", emp.getDepartment(emp_id));
                System.out.printf("%11s    ", emp.getDesignation(emp_id));
                System.out.printf("%6d\n", emp.calculateSalary(emp_id));
            } else {
                System.out.println("There is no employee with empid : " + emp_id);
            }

        }

    }

}
