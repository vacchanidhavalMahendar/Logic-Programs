import java.util.Scanner;

//17.Java program which intakes width and height of a Rectangle and there by print its area
public class Program_17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width of the Rectangle: ");

        double width = scanner.nextDouble();

        System.out.println("Enter height of the Rectangle: ");

        double height = scanner.nextDouble();

        System.out.println("Area of the rectangle is: "+(width *height));

        scanner.close();

    }

}

