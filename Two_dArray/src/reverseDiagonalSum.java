import java.util.Scanner;

public class reverseDiagonalSum {
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
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if ((i + j) == row - 1) {
                    sum = sum + arr[i][j];
                }
            }
        }
        System.out.println("Sum of diagonal elements : " + sum);
    }
}
