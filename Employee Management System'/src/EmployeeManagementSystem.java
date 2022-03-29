
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) throws Exception {
        String fileName = "Employee Data";
        Scanner s = new Scanner(System.in);

        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);




        boolean check = true;
        while(check) {
            System.out.println("Main Menu: \n" +
                    "1. Add an Employee\n" +
                    "2. Display All\n" +
                    "3. Exit");
            int n = s.nextInt();
            switch (n){
                case 1:
                    System.out.println("Enter Employee ID: ");
                    int empId = s.nextInt();
                    s.nextLine();
                    System.out.println("Enter Employee Name: ");
                    String empName = s.nextLine();
                    System.out.println("Enter Employee Age: ");
                    int empAge = s.nextInt();
                    System.out.println("Enter Employee Salary: ");
                    int empSalary = s.nextInt();
                    Employee employee = new Employee(empId,empName,empAge,empSalary);
                    oos.writeObject(employee);
                    break;
                case 2:
                    System.out.println("---Report---");
                    while (fis.available() > 0){
                        employee = (Employee) ois.readObject();
                        System.out.println(employee);
                    }
                    System.out.println("---End of Report---");
                    break;
                case 3:
                    System.out.println("Exiting the System");
                   check= false;
                   break;
            }
        }
        fis.close();
        ois.close();
        fos.close();
        oos.close();

    }
}
