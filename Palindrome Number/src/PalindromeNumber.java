public class PalindromeNumber {
    public static void main(String[]args){
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
    }
    public static boolean isPalindrome(int number){
      int reverse=0;
      int orignalNumber=number;
      if(number>0){
      while(number>0) {
          int lastDigit = number % 10;
          reverse = reverse * 10;
          reverse += lastDigit;
          number /= 10;
      }
if (reverse==orignalNumber){
    return true;
}
      }
      else if(number<0){
          while(number<0) {
              int lastDigit = number % 10;
              reverse = reverse * 10;
              reverse += lastDigit;
              number /= 10;
          }
          if (reverse==orignalNumber){
              return true;
          }
      }
      return false;

    }
}
