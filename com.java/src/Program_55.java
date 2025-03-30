//55.Java program to reverse each and every word in the given String text
public class Program_55 {
    public static void main(String[] args) {


        String str ="Dhaval is a good Java Developer";
        String[] words = str.split(" ");

        String reversedStr = "";

        for(String word : words) {

            String reversedWord="";

            for(int i=word.length()-1;i>=0;i--) {

                reversedWord = reversedWord + word.charAt(i);

            }

            reversedStr = reversedStr +reversedWord +" ";

        }

        System.out.println(reversedStr);


    }

}
