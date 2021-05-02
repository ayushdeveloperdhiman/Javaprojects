import java.io.*;
import java.util.*;
import java.lang.Math;
class Solution {
    public static int beautifulFunction(int N){
        int count=0;
        while(N%10!=0) {
            if (N % 10 == 0) {
                return count;
            } else {
                N = N + 1;
                count++;
                beautifulFunction(N);
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N;
        N=scan.nextInt();
        int result;
        result = beautifulFunction(N);
        System.out.print(result);
        return ;
    }
}