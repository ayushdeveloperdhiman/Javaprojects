import java.util.Scanner;

public class EncodedDigitalLock {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long encodedLock=s.nextLong();
        long temp=encodedLock;
        long sum=0;
        while(temp!=0){
            long r=temp%10;
            sum+=r*r*r;
            temp/=10;
        }
        if(sum==encodedLock){
            sum=0;
            while(encodedLock!=0){
                long r=encodedLock%10;
                if(r%2==0){
                  sum+=r;
                }
                encodedLock/=10;
            }
            System.out.println(sum);
        }else{
            sum=0;
            while(encodedLock!=0){
                long r=encodedLock%10;
                if(r%2!=0){
                    sum+=r;
                }
                encodedLock/=10;
            }
            System.out.println(sum);
        }
    }
}
