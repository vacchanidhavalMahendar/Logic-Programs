import java.util.Scanner;

//4Question  :Java Program for intaking two numbers using Scanner and printing their sum
public class Program_4 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);


        System.out.println("Enter the first number");
        int firstNumber=sc.nextInt();

        System.out.println("Enter the second number");
        int secondNumber=sc.nextInt();

        System.out.println("The SUm of the two number is " + (firstNumber +secondNumber));

        sc.close();



    }
}
