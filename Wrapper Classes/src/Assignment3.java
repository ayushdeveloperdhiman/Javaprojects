import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = s.nextInt();
        String binaryRepresentation = Integer.toBinaryString(n);
        if(binaryRepresentation.length() < 8){
            for (int i = binaryRepresentation.length();i<8;i++){
                binaryRepresentation = "0"+binaryRepresentation;
            }
            System.out.println(binaryRepresentation);
        }else {
            System.out.println(binaryRepresentation);
        }

    }
}
