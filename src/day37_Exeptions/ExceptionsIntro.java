package day37_Exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsIntro {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

      String str = "Java";
      //char ch = str.charAt(250); unchecked exception
      //  System.out.println(ch);

        Pizza pizza = null;
      //  pizza.calcCost();     null pointer Exceptions
       //  System.out.println(50/0);  arithmetic exceptions
        System.out.println("Hello World");

        System.out.println("----------------------------------------------------------");

        int score = 100;
        if(score > 59){
            System.out.println("Your grade is D");
        }else if(score > 70){
            System.out.println("Your score is C");
        }
        System.out.println(score);

        System.out.println("----------------------------------------------------------");

       // FileInputStream file = new FileInputStream(""); checked exceptions

      //  Thread.sleep(3000);    //Interoped EXC

        System.out.println("----------------------------------------------------------");











    }
}
