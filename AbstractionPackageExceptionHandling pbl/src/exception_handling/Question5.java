package exception_handling;

public class Question5 {
    public static void main(String[] args) throws InvalidAgeException,ArrayIndexOutOfBoundsException {
        String name = args[0];
        int age = Integer.parseInt(args[1]);

        if (age < 18 || age >= 60) {
            throw new InvalidAgeException();
        }
        System.out.println("Name : "+name+" age : "+age);


    }
}
