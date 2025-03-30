//48.Java program to find the maximum and minimum in the given Array

public class Program_48 {
    public static void main(String[] args) {

        int a[] ={8,1,5,9,12,33,23,7,4,3};

        int max =a[0];  //Initially set just

        int min =a[0];


        for(int i =0;i<a.length;i++){


            if(max<a[i]){//a[0] <a[i]   //

                max=a[i];

            }

            else if(min>a[i]){

                min =a[i];

            }

        }

        System.out.println("Maximum Element in an array is" +max);
        System.out.println("Minimum Element in an aray is "+min);




    }
}
