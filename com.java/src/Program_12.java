//12.Java Program to find the perimeter of the circle

//We have to input the radius to the Program.
//- Radius is the center of the circle to the border of the circle.
//Perimeter of the circle is 2 * Pi * r

import java.util.Scanner;

public class Program_12 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the Radius of the Circle:");

        int radius=scanner.nextInt();

        System.out.println("Permiter of the circle is " + 2 *Math.PI *radius);


    }
}
