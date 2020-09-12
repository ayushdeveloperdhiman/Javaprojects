public class ParsingValueFromAString {
    public static void main(String[]args){
        String numberAsString="2020";
        System.out.println("Number As String "+numberAsString);
        int number=Integer.parseInt(numberAsString);
        System.out.println("Number "+number);
        numberAsString+=1;
        number+=1;
        System.out.println("Number As String "+numberAsString);
        System.out.println("Number "+number);
        double number2=Double.parseDouble(numberAsString);
        System.out.println("Double "+number2);
    }
}
