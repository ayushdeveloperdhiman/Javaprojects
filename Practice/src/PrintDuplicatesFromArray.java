import java.util.Scanner;

public class PrintDuplicatesFromArray {
    public static void main(String[] args) {
        System.out.println("Enter size of an array");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int[] arr=new int[s];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count--;
                    System.out.print(arr[i]+" ");
                    arr[i]=count;
                }
            }
        }
    }
}
