package exception_handling;

public class InvalidCountryException extends Exception{
    public InvalidCountryException(){
        System.out.println("InvalidCountryException occurred");
    }

    @Override
    public String getMessage() {
      return "User Outside India cannot be registered";
    }
}

