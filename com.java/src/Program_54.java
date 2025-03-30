//54.54. Java program to find the number of occurances of a character in the given String text

public class Program_54 {
    public static void main(String[] args) {

        String s  = "Dhaval is a good person";
         int beforelength =s.length();

       String s1=  s.replace("a","");

        int aferremovingLength =s.length();


        System.out.println("Number of occurrences of o in the string is: "+(beforelength-aferremovingLength));


    //Approach 2
int count =0;
        String myString  = "Java is high level programming level";

         char[] a = myString.toCharArray();
    for(int i=0;i<a.length;i++){

        if('o' ==a[i]){
            count++;
        }
    }
        System.out.println("The number of occurence of the o in given string is" +count);
    }
}
