import java.util.Scanner;
//38.Java program to count the number of even and odd digits in the given number
public class Program_38 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Digit Number"); //5412

        long num =sc.nextInt(); //5412

        //logic for counting number of even and odd digits in the given number

        //Initially it has set to zero

        long evenCount =0;
        long oddCount =0;

         while(num>0){ //It will iterate as long as the conditon is true

             long  remainder = num %10;   //5412 %10  ==>It will give last digit as output so here 2
             //2 is stored in the remainder


             if(remainder%2==0){  //Remainder as zero then it would be even
                 evenCount++; //Increment by 1
             }

             else{
                 oddCount++;
             }

             //Next time number should not be same right

             num =num/10; //5412/10  -->541

             System.out.println("The number of even digits in the number is: "+evenCount);
             System.out.println("The number of odd digits in the number is: "+oddCount);

             sc.close();


         }

    }
}
