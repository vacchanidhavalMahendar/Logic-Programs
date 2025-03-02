import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//32.Java program to remove the duplicates from the Array with the help of HashSet
public class Program_33 {

    public static void main(String[] args) {


        //Array
        int [] arr= {5,3,4,5,5,5,4,9,7,6,9};

        Set<Integer> set =new HashSet<>();


        for(int i=0;i<arr.length;i++){

            set.add(arr[i]);

        }

         Integer[] b = set.toArray(new Integer[set.size()]);

        System.out.println("The Final Element after removing the duplicates are" + Arrays.toString(b));


    }
}
