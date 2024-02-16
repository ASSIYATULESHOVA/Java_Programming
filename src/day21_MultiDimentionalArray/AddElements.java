package day21_MultiDimentionalArray;

import Utilities.ArrayUtilities;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {

        int[] array = {10,20,30,40,50,60,70,80}; // size is fixed
        int element = 90;

        int [] new_Array = Arrays.copyOf(array,array.length+1);
              new_Array[new_Array.length-1] = element;
        System.out.println(Arrays.toString(new_Array));

        System.out.println("=====================================");

int [] numbers = {100,90,80,70,60};
      numbers =  ArrayUtilities.addElement(numbers,50);
        System.out.println(Arrays.toString(numbers));

        System.out.println("=====================================");

        String[] name = {"Anna", "Molly", "Sofia"};

        name = ArrayUtilities.addElement(name,"Monica");

        System.out.println(Arrays.toString(name));

    }
}
