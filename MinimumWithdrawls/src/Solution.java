import java.io.*;
import java.util.*;
import java.lang.Math;

class Solution {
    public static int minimumWithdrawal(int[] ATM, int X) {
        int i = 0, count1 = 1;
        int sum = 0;
        for (i = 0; i < ATM.length; i++) {
            int n = ATM[i];
            sum = sum + n;
            if (sum == X) {
                break;
            }
            count1++;
        }
        int sum2 = 0, count2 = 1;
        for (int j = ATM.length - 1; j > 0; j--) {
            int n = ATM[j];
            sum2 = sum2 + n;
            if (sum2 == X) {
                break;
            }
            count2++;
        }
        if (sum == X) {
            if (count1 < count2) {
                return count1;
            }
            if (count1 > count2) {
                return count2;
            }
            if (count1 == count2) {
                return count1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N;
        N = scan.nextInt();
        int[] ATM = new int[N];
        for (int j = 0; j < N; j++) {
            ATM[j] = scan.nextInt();
        }
        int X;
        X = scan.nextInt();
        int result;
        result = minimumWithdrawal(ATM, X);
        System.out.print(result);
        return;
    }
}