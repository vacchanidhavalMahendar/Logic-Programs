//42.Java program to separately print the even and odd number in the given array
public class Program_42 {
    public static void main(String[] args) {



        int [] array= {6,1,2,4,7,5,9};

        System.out.println("The Below are the even Numbers available in the given arrays is");


        for(int evenNumber:array){

            if(evenNumber%2==0){
                System.out.print(evenNumber +"Is the even Number");
            }
        }

        System.out.println("Below are the odd numbers");
        for(int oddNumber:array){

            if(oddNumber%2!=0){
                System.out.println(oddNumber +"Is the Odd Number");
            }

        }



    }
}
