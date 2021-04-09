import java.util.Scanner;

public class FrequencyCounter {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int arr[]=new int[10];
        int freq[]=new int[10];
        System.out.println("Enter elements : ");
        for(int i=0;i< arr.length;i++){
            arr[i]=s.nextInt();
            freq[i]=-1;
        }
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    freq[j]=0;
                }
            }
            if(freq[i]!=0){
                freq[i]=count;
            }
        }
        for(int i=0;i< arr.length;i++){
            if(freq[i]!=0){
                System.out.println(arr[i]+" comes "+freq[i]+" times.");
            }
        }
    }
}
