//41.Java program to find the sum of all the elements in the Array
public class Program_41 {

    public static void main(String[] args) {


        //Take an array
        int [] array ={1,2,3,4,5,6,7,8,9,10};

        int sumOfArray =0;

        for(int i=0;i<array.length;i++){  //at zeroth index i have 1

            sumOfArray =sumOfArray+array[i];     //0+array[0] -> 0+1 =1

        }
        System.out.println("Sum of all elements in an array is" +sumOfArray);
    }
}
