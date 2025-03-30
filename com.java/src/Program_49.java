import java.util.Scanner;

//49.Java program to search for the given element in the array
public class Program_49 {

    public static void main(String[] args) {

        int[] array ={8,1,5,9,12,33,23,7,4,3};
        boolean found =false;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter any number that you want to search in an array");  //9

        int searchingNumber =sc.nextInt(); // 9

        for(int i=0;i<array.length;i++){

            //Comparting search numbe with each and every elements
            if(searchingNumber ==array[i]){
                System.out.println(searchingNumber +"is available in the given index" + i);
                
                found =true;
                break;
            }
        }

        if(!found){
            System.out.println(searchingNumber +"is  Not available in the given index");
        }


    }
}
