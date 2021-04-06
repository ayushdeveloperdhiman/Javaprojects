import java.util.Scanner;

public class nearestPrimeNumber {
    public static void main(String[] args)
    {
        int arr[] = new int[11];
        int j;
        System.out.println("Enter 11 elements");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = s.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=2)
            {
                arr[i]=2;
            }
            else{
                for(j=0;j<arr[i];j++)
                {
                    if(arr[i]%2==0)
                    {
                        break;
                    }
                }
                if(j==arr[i])
                {
                    continue;
                }int k;
                for(k=arr[i];k>=2;k--){
                    for(int m=2;m<k;m++){
                        if(k%m==0){
                            break;
                        }
                        if(m==k){
                            break;
                        }
                    }
                }
            }
        }
    }
}