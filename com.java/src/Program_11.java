//Program 11 :Java program which intakes two numbers and finds the quotient and reminder

import java.util.Scanner;

public class Program_11 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");

        int num = scanner.nextInt();

        System.out.println("Enter the divisor:");

        int divisor = scanner.nextInt();

        System.out.println("Quotient is: " + (num / divisor));

        System.out.println("Remainder is: " + (num % divisor));

        scanner.close();

    }

}