import java.util.Scanner;

//20.Java program to find the sum of all the digits in the inputted number
public class Program_20 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter any Digit Number");

        int actualNumber=sc.nextInt();  //5124

        sc.close();

        //Logic for adding  all the digits in the given digit numbers
     int sum=0;
        while(actualNumber!=0){

            int remainder= actualNumber % 10;
           sum = sum+remainder; //4
            actualNumber=actualNumber/10; //512

        }
        System.out.println("Sum of all digits in the given number is"+ sum);
    }
}
