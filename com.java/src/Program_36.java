import java.util.HashSet;

//36.Java program to find the duplicate element in the array using HashSet
public class Program_36 {

    public static void main(String[] args) {

        int[] a = {3,4,5,3,6,4};

        HashSet<Integer> hset = new HashSet<Integer>();

        for(int i=0;i<a.length;i++) {

            if(hset.add(a[i])==false) {

                System.out.println(a[i]+" is duplicated");

            }


        }


    }

}

