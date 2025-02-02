import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//23.Java program which intakes String and prints the duplicate characters along with number of times
public class Program_23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter any English statement"); //arun motoori
        String stringText =sc.nextLine();

        //Need to investigate each and every character of the string and add it in the hashmap

         char[] ch=stringText.toCharArray();


         Map<Character,Integer> hashMap= new HashMap<Character,Integer>();

    for(Character c:ch){
        if(hashMap.containsKey(c)){
            hashMap.put(c,hashMap.get(c)+1);  //is same character is already there increment b 1
        }
        else{
            //in hashmap if a is not there it will got the else block
            hashMap.put(c,1);
        }

    }


        for(Character c : hashMap.keySet()) {

            if(hashMap.get(c) > 1) {
                System.out.println("Character "+c+" is repeated: "+hashMap.get(c)+" times");
            }

        }

        sc.close();

    }

}


