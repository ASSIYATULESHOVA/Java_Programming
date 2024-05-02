package day37_Exeptions;

import day29_Inheritance.AnimalTask.Cat;

public class MultipleCatchBlock {
    public static void main(String[] args) {

        System.out.println("Program 1 started");

        Cat car = null;

        try{
            car.drive();
        }catch (NullPointerException e) {
            System.out.println("First Catch");

        }
            System.out.println("Program 1 ended");



    }
}
