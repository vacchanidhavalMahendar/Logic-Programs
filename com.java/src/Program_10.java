//Program 9 : We have to input the radius to the Program.
//- Radius is the center of the circle to the border of the circle.
//Area of the circle is Pi * radius * radius.

import java.util.Scanner;

public class Program_10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius of the circle");

        double radius= sc.nextDouble();

        System.out.println("Area of the Circle is " +Math.PI*radius*radius);
        sc.close();

    }
}
