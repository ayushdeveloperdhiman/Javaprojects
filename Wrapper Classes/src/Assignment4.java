public class Assignment4 {
    public static void main(String[] args)throws Exception {
        Employee emp = new Employee(140,"Ayush Dhiman",7018515995L);
        Employee emp1 = emp.clone();
        emp.setId(25);
        System.out.println(emp.getId());
        System.out.println(emp1.getId());

    }
}

class Employee implements Cloneable{
    private int id;
    private String name;
    private long phoneNumber;

    public Employee(int id, String name, long phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    protected Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
}


