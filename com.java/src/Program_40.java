import java.util.Scanner;

//40.Java program to find the largest of given three numbers
public class Program_40 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number");
        int a =sc.nextInt();

        System.out.println("Enter the second number");

        int b = sc.nextInt();

        System.out.println("Enter the third Number");

        int c = sc.nextInt();


        if(a>b && a>c){
            System.out.println(a + "is the Largest of the given three numbers");

        }

        else if(b>c){
            System.out.println(b + "is the largest of the given Three Numbers");
        }

        else{

            System.out.println(c + "Is the largest of the given Three Numbers");
        }

        sc.close();
    }
}
