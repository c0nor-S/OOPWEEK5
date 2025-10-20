package week5.atu.ie;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int age = 0;

            try {
                System.out.println("Enter Your Age: ");
                String text = sc.nextLine().trim();

                age = Integer.parseInt(text);
                System.out.println("Thanks! You Entered: " + age);
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid Input: " + e.getMessage());
            }
    }
}