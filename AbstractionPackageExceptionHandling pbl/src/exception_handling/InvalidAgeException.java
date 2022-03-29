package exception_handling;

public class InvalidAgeException extends Exception{
    @Override
    public String getMessage() {
        return "Invalid age : Enter age in range 18 to 59";
    }
}
