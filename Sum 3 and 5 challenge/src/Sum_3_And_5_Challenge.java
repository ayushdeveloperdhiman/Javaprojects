public class Sum_3_And_5_Challenge {
    public static void main(String[]args){
        int count=0,sum=0;
        for(int i=1;i<=1000;i++){
            if(i%3==0 && i%5==0){
                sum+=i;
                System.out.println("Found number = "+i);
                count++;
                if(count==5)
                    break;
            }

        }
        System.out.println(("Sum of above numbers = "+sum));
    }
}
