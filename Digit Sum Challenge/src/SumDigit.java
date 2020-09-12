public class SumDigit {
    public static void main(String[]args){
        System.out.println(SumDigits(1));

    }
    public static int SumDigits(int n){
        if(n<10){
            return -1;
        }
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            n/=10;
        }
        return sum;
        }

    }

