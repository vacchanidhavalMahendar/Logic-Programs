import java.util.Scanner;

//32.Factorial of the given Number
public class Program_32 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number:");

        int num = scanner.nextInt();

        int fact = factorial(num);

        System.out.println("Factorial of the given number is: " +fact);

        scanner.close();

    }

    public static int factorial(int n) {

        if(n==0) {

            return 1;

        } else {

            return n*factorial(n-1);
        }
    }
}
