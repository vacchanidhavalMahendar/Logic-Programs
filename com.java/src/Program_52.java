//52.Java program to remove special characters, spaces and other junk from the given String text

public class Program_52 {
    public static void main(String[] args) {

        String str = "$131#@% $abcd123 ABCDEF()";

        String str2 = str.replaceAll("[^a-zA-Z0-9]","");

        System.out.println(str2);

    }

}

