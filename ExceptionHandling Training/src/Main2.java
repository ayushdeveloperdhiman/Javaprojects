public class Main2 {
    public static void main(String[] args) {
        try {
            passwordCheck("ydkas");
        }catch (Exception e){
            System.out.println(e);
        }

    }
    public static void passwordCheck(String pass) throws Exception{
        if(pass.length()<15){
            throw new Exception("Password length can't be less than 15.");
        }else{
            System.out.println("Your password is : "+pass);
        }
    }
}
