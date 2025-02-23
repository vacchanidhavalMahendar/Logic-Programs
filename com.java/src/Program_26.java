//26.Java program to reverse a String
public class Program_26 {

    public static void main(String[] args) {

        String str = "Dhaval Patel";

        char[] ch = str.toCharArray();
        int size = ch.length;
        String reverseString = "";

        for (int i = size - 1; i >= 0; i--) {
            reverseString = reverseString + ch[i];


        }
        System.out.println("The reverse string is" + reverseString);
    }
}
