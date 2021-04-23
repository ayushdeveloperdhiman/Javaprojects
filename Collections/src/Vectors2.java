import java.util.Vector;

public class Vectors2 {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector();
        v.add(10);
        v.add(25);
        v.add(30);
        v.add(1,60);
        for(int i=0;i<v.size();i++){
            System.out.println(v.get(i));
        }
    }
}
