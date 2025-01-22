//13.Java program to find the power of a number

import java.util.Scanner;

public class Program_13 {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number");

        int number=sc.nextInt();
        int initialNumber = number;

        System.out.println("Enter the Power");

        int power=sc.nextInt();

        for(int i=1;i<power;i++){

            number= initialNumber*number;
        }

        System.out.println("The "+initialNumber +" power "+power+" is: "+number);

        sc.close();


    }
}
