//24.Java program to print number of letters, digits, spaces and other things in the inputted statement

import java.util.Scanner;
public class Program_24 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter any String text");  //$%# are the 3 symbols

         String str =sc.nextLine();

          char[] characterArray = str.toCharArray();

          int digits=0;
          int letter=0;
          int space=0;
          int otherCount=0;
          //Iterate each and every character of the given array

        for(Character c:characterArray){ //For every character in the given array

            if(Character.isDigit(c)){

                digits++;
            }
            else if(Character.isLetter(c)){
                letter++;
            }


            else if(Character.isSpaceChar(c)){
                space++;
            }
            else {

                otherCount++;

            }



        }

        System.out.println("Number of letters is: "+letter);
        System.out.println("Number of digits is: " +digits);
        System.out.println("Number of spaces is: " +space);
        System.out.println("Number of other things is: "+otherCount);

        sc.close();

    }
}
