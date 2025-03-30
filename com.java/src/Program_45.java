import java.util.Arrays;

//45.Java program to compare two arrays
public class Program_45 {
    public static void main(String[] args) {

        int array1[] = {1,2,3,4,5};
        int array2[] = {1,2,3,4,5};

        if(Arrays.equals(array1, array2)){
            System.out.println("Arrays are Equal");
        }

        else{
            System.out.println("The Given Arrays are not Equal");
        }



    }
}
