package calculator;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Sandip Patel
 */

public class Main {
    public static void main(String[] args) {
        // Declaring a scanner object
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Please enter first number : "); // Input wizard
            int a = scanner.nextInt();
            System.out.println("Please enter second number : ");// Input wizard
            int b = scanner.nextInt();
            System.out.println("Please enter one of symbol +,-,*,/"); // Input wizard
            char symbol = scanner.next().charAt(0);
            Calculator calculator= new Calculator();
            calculator.calculateResult(a,b, symbol);
            System.out.println("Would you like to do more calculation Please enter “Y” or “N” :");// Input wizard
            answer= scanner.next().toLowerCase(Locale.ROOT);
        }
        while (answer.startsWith("y"));
        // Closing a scanner object
        scanner.close();
    }
}

