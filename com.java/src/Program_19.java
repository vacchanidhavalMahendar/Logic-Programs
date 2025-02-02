import java.util.Scanner;

//19.Java program to intake width and height of a Rectangle and find its perimeter
//Perimeter of rectangle =2(width+height);
public class Program_19 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the  width of the rectangle");

        int width=sc.nextInt();

        System.out.println("Enter the Height of the rectangle");

        int height=sc.nextInt();

        System.out.println("Permiter of the Rectangle" + 2*(width+height));
    }
}
