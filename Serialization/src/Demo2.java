import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("Object.xyz");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        xyz x1 = (xyz) objectInputStream.readObject();
        x1.m1();
    }

}
