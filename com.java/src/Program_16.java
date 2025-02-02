//16.Java program to find the sum of all even numbers from 1 to 10
//A number which is divisble by 2 and itself
public class Program_16 {
    public static void main(String[] args) {

        int  sum=0;

        //iterate for loop

        for(int i=1;i<=10;i++){

            if(i%2==0){
                sum=sum+i;
            }

            System.out.println("The sum of all even numbers from 1 to 10 is" + sum);

        }
    }
}
