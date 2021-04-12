import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
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
        System.out.println("Array after transpose :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[j][i] + "\t");
            }
            System.out.println("");
        }
    }
}
