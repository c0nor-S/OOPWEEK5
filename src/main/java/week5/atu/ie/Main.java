package week5.atu.ie;

import java.io.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter The File Name (e.g. students.txt): ");
            String fileName = sc.nextLine().trim();

            System.out.println("Enter A Name To Save: ");
            String name = sc.nextLine().trim();

            try(PrintWriter out = new PrintWriter(new FileWriter(fileName, true)))
            {
                out.println(name);
                System.out.println("Saved To: " + fileName);
            }

            catch (IOException ex) {
                System.out.println("Could Not Write To File: " + ex.getMessage());
            }
    }
}