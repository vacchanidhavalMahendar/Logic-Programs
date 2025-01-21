//7 Program :Java program to check whether the given year is a Leap Year
/*Leap Year is an year having 366 days, while the normal year has 365 days.
If the year is evenly divisible by 4 and not divisible by 100, then it is a Leap year.
If the year is evenly divisible by both 4 and 100, then we need to check if it is evenly divisible by 400, to confirm it as Leap year.*/

//year/4==0 and year/100 !=100  -->Its an Leap Year
//Case 2: year /4==0 and year/100 ==0 (And also need to check  year/400 ==0) -->Its an Leap year

import java.util.Scanner;

//Year/4==0 and year /100 ==0 and year/400 !=0 (Its not an leap year)
public class Program_7 {
    public static void main(String[] args) {



        Scanner sc= new Scanner(System.in);

        System.out.println("Enter any year which you want to add");

        int year= sc.nextInt();

        //Logic for checking whether the given year is leap year or not
         boolean isLeapYear=false;
        if(year %4==0) {

            if(year %100==0) {

                if(year %400==0) {

                    isLeapYear = true ;

                } else {

                    isLeapYear = false ;

                }

            } else {

                isLeapYear = true ;

            }


        } else {

            isLeapYear = false ;

        }


        if(isLeapYear== true) {

            System.out.println("Given year " +year +" is a leap year");

        }else {

            System.out.println("Given year " +year +" is not a leap year");

        }

        sc.close();

    }

}