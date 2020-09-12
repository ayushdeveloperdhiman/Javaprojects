import java.util.Scanner;
import java.util.Random;
public class Library {
    public static void main(String[]args){
        int numberOfBooks=555041;
        int numberOfEmployees=10;
        String[] subjects={"Maths","Java","English","Chemistry","Computer","Physics","Biology"};
        System.out.println("Welcome To Library\n");
        System.out.println("Number of books : "+numberOfBooks);
        System.out.println("Number of employees working : "+numberOfEmployees);
        System.out.println("Subject books available :\r");
        for(int i=0;(i<=subjects.length-1);i++){
            System.out.println((i+1)+" : "+subjects[i]);
        }
        checkBook();
    }
    public static void checkBook(){
        boolean a=false;
        int i;
        String[] subjects={"maths","java","english","chemistry","computer","physics","biology"};
        Scanner s=new Scanner(System.in);
        System.out.println("Enter book name : ");
        String book=s.nextLine();
        for(i=0;i<=(subjects.length-1);i++) {
            if (book.toLowerCase().equals(subjects[i])) {
                a=true;
                break;
            }
        }
        if(a){
            Random r=new Random();
            int id=r.nextInt(1000);
            System.out.println("Book name : "+subjects[i]);
            System.out.println("Book id : "+id);
        }else{
            System.out.println("Null");
        }
    }
}
