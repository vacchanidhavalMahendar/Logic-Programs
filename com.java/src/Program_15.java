import java.util.Scanner;

//15.Java program which intakes 6 numbers as input and prints their average
public class Program_15 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        //initializing the value as zero
        int sum=0;

        for(int i=0;i<=6;i++){
            System.out.println("Enter" + i +"number");
            int number=sc.nextInt();
            sum=sum+number;
        }
        System.out.println("Average of the six numbers are"+ sum/6);
    }
}
