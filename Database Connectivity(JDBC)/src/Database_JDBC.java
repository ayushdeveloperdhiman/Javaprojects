import java.sql.Connection;

import java.sql.Statement;
import java.util.Scanner;

public class Database_JDBC {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter id");
        int id=s.nextInt();
        System.out.println("Enter name");
        String name=s.next();
        System.out.println("Enter age");
        int age=s.nextInt();
        System.out.println("Enter location");
        String loc=s.next();
        try {
            Connection con=ConnectionDB.getConnection();
            Statement st=con.createStatement();
            String qry="INSERT INTO people(id,name,age,location) values("+id+",'"+name+"',"+age+",'"+loc+"')";
            int b=st.executeUpdate(qry);
            System.out.println(b);
            if(b==1){
                System.out.println("Value inserted");
            }else{
                System.out.println("Value not inserted");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
