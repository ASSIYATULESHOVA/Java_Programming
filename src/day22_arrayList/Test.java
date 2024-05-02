package day22_arrayList;

import Utilities.ArrayUtilities;

public class Test {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60,70,80,90};

       boolean has25 = ArrayUtilities.contains(numbers, 25);

        System.out.println("Has 25? "+ has25);

        System.out.println("============================");

        String[] str = {"Asiya Tuleshova", "Moldir"};

        boolean hasLastName = ArrayUtilities.contains(str,"Saidikarim");

        System.out.println("Has last name "+hasLastName);

        System.out.println("-------------------------------------------------");

        char[] ch = {'A','B','C','E'};

        boolean hasE = ArrayUtilities.contains(ch,'E');
        System.out.println(hasE);
    }
}
