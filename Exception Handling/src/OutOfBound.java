import java.util.Scanner;

public class OutOfBound {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter  size of an array");
        int size=s.nextInt();
        int[] array=new int[size];
        for(int i=0;i< array.length;i++){
            System.out.print("Enter "+(i+1)+" element :");
            array[i]=s.nextInt();
        }
        System.out.println();
        try{
            System.out.print("Enter index :");
            System.out.println(array[s.nextInt()]);
        }catch (Exception e){
            System.out.println("Out of bound");
        }
    }
}
