import java.io.*;

public class DemoTransient {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        xyz x = new xyz();
        x.d1 = 4.5;
        x.d2 = 50.4;
        x.d3 = 4.5;
        x.m1();
        FileOutputStream fileOutputStream = new FileOutputStream("Object.xyz");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(x);
        objectOutputStream.flush();
        objectOutputStream.close();


    }
}
class xyz implements Serializable {
    double d1;
    double d2;
    static double d3;
    void m1(){
        System.out.println("The value of d1 is :"+d1);
        System.out.println("The value of d2 is :"+d2);
        System.out.println("The value of d3 is :"+d3);
    }
}


