//Program 8:Java program to check whether the given character is a Vowel
//In English, Vowels are the below characters in the lowercase and uppercase:
//- a, e, i, o and u
//- A, E, I, O and U


import java.util.Scanner;

public class Program_9 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter any character");

         char c = scanner.next().charAt(0); // it means first index
        scanner.close();

        //Logic 1:To check whether the character is vowel or not
        boolean isVowel= false;

        switch (c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': isVowel=true;

        }

        if(isVowel){
            System.out.println(c  + "is a vowel");
        }

        else{
            System.out.println(c  + "is not a vowel");
        }



        //Logic 2
        System.out.println("enter a character here to check it is vowels or consonants");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch == 'a' ||ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u'|| ch == 'A'|| ch == 'E'|| ch == 'I' ||ch == 'O'||ch == 'U') {
            System.out.println("given character is vowel");

        }
        else {
            System.out.println("given character is consonants");
        }
        sc.close();

    }
}
