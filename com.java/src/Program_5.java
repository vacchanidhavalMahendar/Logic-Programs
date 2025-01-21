import java.util.Scanner;

//Source:QA Fox
//5 Program:Java program to check whether the given input number is even or odd
public class Program_5 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Please Enter the number");

        int number=sc.nextInt();

        if(number %2==0){
            System.out.println("Given Number " + " " + number + "is Even Number");

        }

        else{

            System.out.println("Given Number is" + " " + number + "is odd Number");

        }
        sc.close();


    }
}
