package day38_Exceptions;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowKeyWords {
    public static void main(String[] args) {

        System.out.println("Program started");

        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();

        if(age < 21 || age > 150){
            if(age < 0){
                throw new RuntimeException("Age of the person can not be negative "+age);
            }else{
                throw new RuntimeException("Age of the person can not be greater than 150 "+age);
            }
        }
        System.out.println("----------------------------------------------");

      //  throw new RuntimeException("Runtime exception");
      //  System.out.println("Hello ");
/*
        try {
            throw new FileNotFoundException("");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
   */
        System.out.println("++++++++++++++++++++++++++++++++++++++");
       // throw exception;
       // throw new RuntimeException();




    }
}
