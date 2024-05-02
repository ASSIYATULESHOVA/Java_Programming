package day37_Exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks2 {
    public static void main(String[] args) {

        System.out.println("Program started");

        int[] arr = {1,2,3,4};
        try {
            System.out.println(arr[1000]);
            System.out.println("Try Block");
        }catch (RuntimeException e){
           // System.out.println("Catch block");
            e.printStackTrace();
        }
        System.out.println("Program ended");

        System.out.println("-----------------------------");

        System.out.println("Program2 started");

        try{
            System.out.println(9/0);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Program2 ended");

        System.out.println("-----------------------------");

        System.out.println("Program3 started");

        try {
            FileInputStream file = new FileInputStream("File Path");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Program3 ended");


        try{

        }catch (RuntimeException e){

        }
    }
}
