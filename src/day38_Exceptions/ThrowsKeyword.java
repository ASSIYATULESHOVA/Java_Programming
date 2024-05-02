package day38_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException {
     /*   System.out.println("Program 1 started");

           // System.out.println(100 / 0);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            //throw new RuntimeException(e);
        }
        System.out.println("Program 1 ended"); */

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("Program 2 started");

         Thread.sleep(5000);

        System.out.println("Program 2 ended");

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("Program 3 started");

   //    FileInputStream file = new FileInputStream("File not found");

        System.out.println("Program 3 ended");


    }
}
