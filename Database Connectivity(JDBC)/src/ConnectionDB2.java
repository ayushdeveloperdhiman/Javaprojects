import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB2 {
    private static Connection con=null;
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Billdb","root","");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return con;
    }
}
