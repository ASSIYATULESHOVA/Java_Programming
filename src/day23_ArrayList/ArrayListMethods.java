package day23_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethods {

    public static void main(String[] args) {

        int []array = {1,2,3,4,5};
        array[0] = 100;
        System.out.println(array);

        System.out.println("=======================================");

        ArrayList<String> groceryList = new ArrayList<>();

        groceryList.add("Eggs");
        groceryList.add("Paper Towels");
        groceryList.add("Apples");
        groceryList.add("Cooking oil");

        System.out.println(groceryList);

        groceryList.set(2,"Oranges");

        System.out.println(groceryList);

        groceryList.add(2,"Chicken"); // increases size

        System.out.println(groceryList);

        groceryList.remove(0); // removed eggs
        groceryList.remove("Paper Towels");
        System.out.println(groceryList);

        System.out.println("======================================================");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

       numbers.remove(Integer.valueOf(20));

        numbers.remove(1);

        System.out.println(numbers);
       numbers.clear();
     numbers.size();
        System.out.println("======================================================");

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Symeye"); //2
        names.add("Symeye"); //3
        names.add("Ali");   // 4
        names.add("Symeye"); //5

        System.out.println(names.indexOf("Vasyl"));
        System.out.println(names.lastIndexOf("Vasyl"));

        System.out.println(names.lastIndexOf("Symeye"));

        System.out.println("=============================================");

        boolean hasMuhtar = names.contains("Muhtar"); // false
        boolean hasVasyl = names.contains("Vasyl");

        System.out.println(hasMuhtar);
        System.out.println(hasVasyl);

        System.out.println("=============================================");













    }
}
