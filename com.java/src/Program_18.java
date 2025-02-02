//18.Swap the two number
public class Program_18 {
    public static void main(String[] args) {

        int a=20;
        int b=10;

        int temp=0; //temparary variabes
        temp=a;  //temp is holding 20


        a=b;     //a is holding 10
        b=temp;    //b is holding 20
        System.out.println("The swap of the two numbers are " + a + b);
    }
}
