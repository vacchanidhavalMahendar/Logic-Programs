import java.util.Scanner;

//6 Question : Java program which prints the multiplication table of the given input number
public class Program_6 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number");

        int number= sc.nextInt();

        for(int i=1;i<=10;i++){

            System.out.println(number + "x" + i + "=" +(number*i));

        }



    }
}
