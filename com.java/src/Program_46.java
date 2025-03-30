//46.Java program logic to compare two arrays without using inbuilt methods
public class Program_46 {
    public static void main(String[] args) {

        int a[] = {1,2,3,4,5};
        int b[] ={1,2,3,4,5};

        boolean comparisonStatus =true; //by default both arrays are equal


        //Step 1:Check both arrays have the same Size

        if(a.length ==b.length){

            //each and every element is matching with the second element
            for(int i=0;i<a.length;i++){

                if(a[i]!=b[i])
                {
                    comparisonStatus =false;
                    break;
                }
            }

        }

        else{
            comparisonStatus =false;
        }

        if(comparisonStatus){
            System.out.println("Both arrays are equal");
        }

        else{
            System.out.println("Both Arrays are not Equals");
        }


    }
}
