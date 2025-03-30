//53.Java program to remove white spaces in the given string text
public class Program_53 {

    public static void main(String[] args) {

        String str = "A   B   C    D" ;

        String str2 =str.replaceAll("\\s","");

        System.out.println("After removing the white spaces" +str2);

    }
}
