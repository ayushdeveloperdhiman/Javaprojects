public class Main6 {
    public static void main(String[] args) {
        otpCheck(1211);
        otpCheck(111141);
        otpCheck(2);
    }
    public static void otpCheck(int otp){
        int count=0;
        while(otp!=0){
            otp =otp/10;
            count ++;

        }
        if(count==4){
            System.out.println("Valid Otp");
        }else{
            System.out.println("Invalid otp");
        }
    }
}
