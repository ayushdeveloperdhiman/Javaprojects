import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Select {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        String name=sc.next();
        try{
            Connection con=ConnectionDB.getConnection();
            Statement st=con.createStatement();
            String qry="Select * from people where name='"+name+"';";
            ResultSet set= st.executeQuery(qry);
            while(set.next()){
                System.out.println(set.getInt(1)+"\t"+set.getString(2)+"\t"+set.getInt(3)+"\t"+set.getString(4));
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
