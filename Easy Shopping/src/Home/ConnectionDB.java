/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Home;

/**
 *
 * @author ayush
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
   private static Connection con=null;
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/EasyShopping","root","");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return con;
    }
}