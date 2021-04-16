import java.util.*;

public class TeamDivision {
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        System.out.println("How many elements you want in array.");
        int n=s.nextInt();
        int inarr[]=new int[n];
        System.out.println("Enter "+n+" elements.");
        for(int i=0;i<n;i++){
            inarr[i]=s.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+inarr[i];
        }
        sum=sum/2;

        int group2[]={};
        Arrays.sort(inarr);
        int outnum1=0;
        int outnum2=0;
        for(int i= inarr.length-1;i>=0;i--){
            outnum1=outnum1+inarr[i];
            if(outnum1<=sum){
                if(outnum1==sum){
                    break;
                }
                continue;
            }else{
                outnum2=outnum2+inarr[i];
                outnum1=outnum1-inarr[i];
            }
        }
        System.out.print(outnum1);
        System.out.print(" ");
        System.out.print(outnum2);
    }
}
