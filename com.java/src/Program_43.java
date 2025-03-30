import java.util.Scanner;

//43.Java program to reverse the given number
public class Program_43 {
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter any Number");  //1234
     int number = sc.nextInt();
//Logic for reversing the number


        int reverseNumber =0;


        while(number>0){

            int remainder = number %10 ; //1234%10 -->Last digit that is 4

            reverseNumber =(reverseNumber*10) + remainder;  //4
            number = number/10; //1234 /10  -- 123

        }

        System.out.println("The Reverse Number is " + reverseNumber);


        
    }
}
