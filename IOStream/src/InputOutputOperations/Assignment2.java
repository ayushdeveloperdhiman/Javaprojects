package InputOutputOperations;

import java.io.*;
import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input file name: ");
        String inputFilename = sc.nextLine();
        System.out.println("Enter the output file name: ");
        String outputFilename = sc.nextLine();

        File filein = new File(inputFilename);
        File fileout = new File(outputFilename);

        BufferedReader br = new BufferedReader(new FileReader(filein));
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileout));

        int ch;
        while ((ch = br.read()) != -1) {
            bw.write(ch);
        };

        br.close();
        bw.close();
        sc.close();
    }
}
