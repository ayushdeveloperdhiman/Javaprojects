import java.util.Scanner;

public class OctalToHxadecimal {

        public static void main(String[] args)
        {
            Scanner obj=new Scanner(System.in);
            System.out.println("enter octal number");
            int num=obj.nextInt();
            char list[]=new char[100];
            int count=0;
            int r;
            int j;
            int i=0;
            int sum=0;
            while(num>0)
            {
                r=num%10;
                if(r>=8)
                {
                    System.out.println("Invalid number !!");
                    System.exit(0);
                }
                sum=sum+r*(int)Math.pow(8,count);
                count++;
                num=num/10;
            }
            while(sum>0)
            {
                r=sum%16;
                if(r<10)
                {
                    list[i]=(char)(r+48);
                    i++;
                }
                if(r>10)
                {
                    list[i]=(char)(r+55);
                    i++;
                }
                sum=sum/16;
            }
            System.out.println("Hexadecimal : ");
            for(j=i-1;j>=0;j--)
            {
                System.out.print(list[j]);
            }

        }

    }

