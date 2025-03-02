import java.util.Scanner;

//31.Java program to find whether the given number is an Armstrong number
public class Program_31 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number"); //153


       // int num = sc.nextInt();


        //Logic for checking arm strong number

        int originalNum = sc.nextInt();

        int num = originalNum ;

        int reminder;

        int cubedNum = 0;

        while(num >0) {

            reminder = num % 10;

            num = num / 10;

            cubedNum = cubedNum + (reminder* reminder* reminder);

        }

        if(cubedNum ==originalNum) {

            System.out.println("Given number is an Armstrong number");

        } else {

            System.out.println("Given number is not an Armstrong number");

        }

        sc.close();

    }
}
