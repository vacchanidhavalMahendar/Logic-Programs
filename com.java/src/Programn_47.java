//47.Java program to find the missing element in the array

public class Programn_47 {
    public static void main(String[] args) {

        int array[] ={1,2,3,4,6};

        //int sumof elements without missing
        int sumWithoutMissing =0;

        for (int i =0;i<=6;i++){

            sumWithoutMissing =sumWithoutMissing+i;
        }

        System.out.println("The  sumwithout missing element of an array is" + sumWithoutMissing);  //21


        //int sum of elements with miss

        int sumOfElementsWithMiss =0;
        for(int j=0;j< array.length;j++){

            sumOfElementsWithMiss =sumOfElementsWithMiss +array[j];

        }


        System.out.println("The  sumwith missing element of an array is" + sumOfElementsWithMiss);  //21




            //Missing Elements in an array

        System.out.println("Missing Elements in given array is" +(sumWithoutMissing-sumOfElementsWithMiss));
    }
}
