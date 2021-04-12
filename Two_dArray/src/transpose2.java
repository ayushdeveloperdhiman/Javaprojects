import java.util.Scanner;

public class transpose2 {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int row = s.nextInt();
        System.out.println("Enter number of columns : ");
        int col = s.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Enter elements : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println("Original array :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }
       int temp[][]=new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                temp[i][j]=arr[j][i];
            }
        }
        System.out.println("After transpose :");
        for (int i = row-1; i >=0; i--) {
            for (int j = 0; j < col; j++) {
                System.out.print(temp[j][i] + "\t");
            }
            System.out.println("");
        }
    }
}
