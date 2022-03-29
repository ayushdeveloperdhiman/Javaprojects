import java.io.*;

public class Demo1 {

    public static void main(String[] args) {
        Student s = new Student("Ayush",1801003016L,7018515995L);
        FileOutputStream fos;

        {
            try {
                fos = new FileOutputStream("Student1");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                System.out.println(s);
                System.out.println(s.id);
                System.out.println(s.name);
                System.out.println(s.phoneNumber);
                oos.writeObject(s);
                oos.flush();
                oos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Student student = null;
        FileInputStream fis;

        {
            try {
                fis = new FileInputStream("Student1");
                ObjectInputStream ois = new ObjectInputStream(fis);
                student = (Student)ois.readObject();
                ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(student);
        System.out.println(student.id);
        System.out.println(student.name);
        System.out.println(student.phoneNumber);
    }




}

class Student implements Serializable{
    String name;
    long id;
    long phoneNumber;

    public Student(String name, long id, long phoneNumber) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }


}
