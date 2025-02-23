import java.util.Scanner;

//28.Java Program to check whether the given number is a palindrome
public class Program_28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");  //1991

        int originalNumber = sc.nextInt();

        int number =originalNumber;
        
        int reverseNumber=0;


        //Step 2:Reversing the given number
      while(number!=0){

          int remainder = number %10;  //1  last digit of number

          reverseNumber =(reverseNumber*10) + remainder;  // 0*10+1  =1

          number = number /10; // 1991 becomes 199 last digit will be gone


      }

        if(reverseNumber ==originalNumber) {

            System.out.println("Given number is a palindrome");

        } else {

            System.out.println("Given number is not a palindrome" );

        }

        sc.close();


    }

}
