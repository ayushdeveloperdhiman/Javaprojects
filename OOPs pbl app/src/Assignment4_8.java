import java.util.Scanner;

public class Assignment4_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str = s.nextLine();
        System.out.println(removeCharacterBeforeAndAfterStar(str));
    }

    public static String removeCharacterBeforeAndAfterStar(String str){
        if(str.contains("*")){
            int index = str.indexOf('*');
            return str.substring(0,index-1)+str.substring(index+2);
        }
        return "Your String : "+str+" does not contain * in it";
    }
}
