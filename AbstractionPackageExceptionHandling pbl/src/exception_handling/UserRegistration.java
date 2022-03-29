package exception_handling;

public class UserRegistration {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.registerUser("Mickey","US");
        userRegistration.registerUser("Mini","India");
    }
    void registerUser(String username,String userCountry){
        try {
            if(userCountry.equalsIgnoreCase("india")){
                System.out.println("User registration done successfully");
            }else {
                throw new InvalidCountryException();
            }
        }catch (InvalidCountryException e){
            System.out.println(e);
        }

    }
}
