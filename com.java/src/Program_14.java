//14.Java program to find the sum of first 100 numbers
public class Program_14 {
    public static void main(String[] args) {

        int sum=0; //initially value as zero

        for(int i=1;i<=100;i++){

            sum=sum+i;

        }

        System.out.println("The sum of the first 100 Numbers are" + sum);
    }
}
