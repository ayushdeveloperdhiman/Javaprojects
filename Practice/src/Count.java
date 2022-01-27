import java.util.Scanner;

 class Count {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        int digit=s.nextInt();
        int count=0;
        while(number!=0){
            int temp=number%10;
            if(temp!=digit){
                count++;
            }
            number=number/10;
        }
        System.out.println(count);
    }
}
