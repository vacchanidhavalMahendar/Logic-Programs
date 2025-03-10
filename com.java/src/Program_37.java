import java.util.Scanner;

//37.Java program to count the number of digits in the given number
public class Program_37 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your digit");  //6854
        int userNumber = sc.nextInt();

        int digitCount =0;


        while(userNumber>0){

            digitCount++;  //Increment by 1   -->1
            userNumber =userNumber/10;  //685 --> 4 will be gone.

        }

        System.out.println("The Count of Digits in the given number " + userNumber);



    }
}
