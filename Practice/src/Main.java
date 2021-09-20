import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String str=""+n;
        int[] arr=new int[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i]=str.charAt(i);
        }

        if(arr.length%2==0){
            for(int i=0;i<arr.length; i=i+2){
                int t = arr[i+1];
                arr[i+1]= arr[i];
                arr[i]=t;
            }
        }
        else{
            for(int i=0;i<arr.length-1; i=i+2){
                int t = arr[i+1];
                arr[i+1]= arr[i];
                arr[i]=t;
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print((char)arr[i]);
        }


    }

}
