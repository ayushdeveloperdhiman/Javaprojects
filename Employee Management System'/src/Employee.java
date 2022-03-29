import java.io.Serializable;

public class Employee implements Serializable {
    private int id;
    private String name;
    private int age;
    private int salary;

    public Employee(int id,String name,int age,int salary){
        this.id = id;
        this.name= name;
        this.age= age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return getId()+" "+getName()+" "+getAge()+" "+getSalary();
    }
}


