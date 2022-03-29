package InputOutputOperations;

import java.io.*;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the file name");
            String fileName = s.nextLine();
            System.out.println("Enter the character you want to search");
            char chr = Character.toLowerCase(s.next().charAt(0));
            File file = new File(fileName);
            FileReader in = new FileReader(file);
            int c;
            int count = 0;
            while ((c =in.read()) != -1){
                if(Character.toLowerCase(c) == chr){
                    count++;
                }
            }
            System.out.println("File '" + fileName + "' has " +
                    count + " instances of letter '" + chr + "'.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
