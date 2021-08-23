import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Product> productArrayList=new ArrayList<>();
        try{
            Connection con=ConnectionDB2.getConnection();
            Statement st=con.createStatement();
            String qry="Select * from Menu";
            ResultSet resultSet=st.executeQuery(qry);
            while(resultSet.next()){
                productArrayList.add(new Product(resultSet.getInt(1), resultSet.getInt(3),resultSet.getString(2) ));
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        Iterator<Product> iterator= productArrayList.iterator();
        System.out.println("\t\t\t\t\t Menu:");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        boolean loop=true;
        while(loop) {
            int id=0;
            System.out.println("Enter the number for the item you want :");
            boolean b=s.hasNextInt();
            if(b) {
                id = s.nextInt();
                if(id<=0 || id> productArrayList.size()){
                    System.out.println("Invalid id");
                    continue;
                }
                if(id<= productArrayList.size()){
                    while(true){
                        System.out.println("Enter how much quantity you want :");
                        b=s.hasNextInt();
                        if(b){
                            int quantity = s.nextInt();
                            Product product = productArrayList.get(id - 1);
                            System.out.println("Your bill is: " + product.getPrice() * quantity);
                            loop=false;
                            break;
                        }else{
                            System.out.println("Invalid input");
                            s.next();
                            continue;
                        }
                    }


                }else {
                    System.out.println("Invalid id");
                    s.next();
                    continue;
                }
            }else{
                System.out.println("Invalid character");
                s.next();
                continue;
            }

        }
    }
}
