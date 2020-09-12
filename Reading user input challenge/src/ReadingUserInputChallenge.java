import java.util.Scanner;
public class ReadingUserInputChallenge {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int count=1;
        int sum=0;
        while(true){
            System.out.println("Enter number "+count+":");
            boolean a =scanner.hasNextInt();
            if(a){
                int number=scanner.nextInt();
                count++;
                sum+=number;
                if(count==11){
                    break;
                }
            }else{
                System.out.println("Invalid Value");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Sum :"+sum);
    }
}
