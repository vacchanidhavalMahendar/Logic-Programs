//35.Java program to find the duplicate elements in the array using index

import java.util.HashSet;

public class Program_35 {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 3, 6, 4, 7, 7, 7};
        HashSet<Integer> seen = new HashSet<>();  // To track unique elements
        HashSet<Integer> printed = new HashSet<>();  // To track duplicates that have been printed

        for (int i = 0; i < a.length; i++) {
            if (seen.contains(a[i]) && !printed.contains(a[i])) {
                System.out.println(a[i] + " is duplicated in the array");
                printed.add(a[i]);  // Mark as printed
            }
            seen.add(a[i]);  // Add to seen set
        }
    }
}
