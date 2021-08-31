public class Nearest {
    public static void main(String[] args) {
        System.out.println(nearestPrime(5));

    }
    public static boolean isPrime(int num){
        boolean b=false;
        for(int i=2;i<=num/2;i++){
            if(num==2){
                return true;
            }
            if(num%i==0){
                return false;
            }
        }
        return true;

    }
    public static int nearestPrime(int n){
        int count1=0,count2=0,num1=0,num2=0;
        for(int i=n-1;i>1;i--){
            count1++;
            if(isPrime(i)){
                num1=i;
                break;
            }
        }
        for (int i=n+1;;i++){
            count2++;
            if(isPrime(i)){
                num2=i;
                break;
            }
        }
        if(count1>count2){
            return num2;
        }else {
            return num1;
        }

    }
}
