//44.Java program to generate a random number within the given range
public class Program_44 {
    public static void main(String[] args) {

        double random = Math.random();

        int range = 15;

        System.out.println("Random number in the given range is: " + (int) (random * range));

    }
}
