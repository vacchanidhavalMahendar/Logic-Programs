//51.Java program for sorting the elements in the Array using build-in functions
import java.util.Arrays;

public class Program_51 {

    public static void main(String[] args) {

        int array[] = {8,1,2,3,4,13,56,79,90,100};

        System.out.println("Before sorting the  elements are" + Arrays.toString(array));

        Arrays.parallelSort(array);

        System.out.println("After sorting the array elements are"+Arrays.toString(array));
    }
}
