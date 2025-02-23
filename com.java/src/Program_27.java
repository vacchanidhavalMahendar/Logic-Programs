import java.util.Scanner;

//27.Java program to check whether the given String text is a Palindrome
public class Program_27 {
    public static void main(String[] args) {


        //Step 1: Intake the String text from the users
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter any String text"); //MADAM OR MOM

        String originalText= sc.nextLine();


        //Step 2:Logic for reversing the String

        char[] ca = originalText.toCharArray();

         int size=ca.length;

         //Emptystring to store the reverseString
         String reverseString ="";

         for(int i=size-1;i>=0;i--){
             reverseString=reverseString+ca[i];

         }


         //Logic for comparing original with reverse string
        if(originalText.equals(reverseString)){
            System.out.println(originalText +"is a palindrome");
        }
        else{

            System.out.println( originalText +"is not  a palindrome");

        }




    }
}
