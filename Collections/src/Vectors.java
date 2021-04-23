import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add(10);
        v.add(10.25);
        v.add("ayush");
        for(int i=0;i<v.size();i++){
            System.out.println(v.get(i));
        }
    }
}
