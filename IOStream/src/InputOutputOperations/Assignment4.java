package InputOutputOperations;

import java.io.*;
import java.util.Date;

public class Assignment4 {
    public static void main(String[] args)throws Exception {
        FileOutputStream fos = new FileOutputStream("data");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        FileInputStream fis = new FileInputStream("data");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Employee employee = new Employee("ayush",new Date(1999,0,12),"HR","dss");
        oos.writeObject(employee);

        employee = (Employee) ois.readObject();
        System.out.println(employee);
    }
}

class Employee implements Serializable {
    private String name;
    private Date dateOfBirth;
    private String department;
    private String designation;

    public Employee() {
    }

    public Employee(String name, Date dateOfBirth, String department, String designation) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", department='" + department + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
