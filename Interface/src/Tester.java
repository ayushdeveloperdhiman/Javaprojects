import java.sql.SQLDataException;

public class Tester {
    static void m() throws Exception {
        throw new Exception();
    }
    static int a = 10;
    public static void main(String[] args) throws Exception {
        try {
            m();
        } catch (Exception e) {
            try {
                throw new Exception();
            }catch (Exception w){
                System.out.println(w);
            }
        }
    }
}
