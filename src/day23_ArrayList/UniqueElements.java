package day23_ArrayList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Symeye"); //2
        names.add("Symeye"); //3
        names.add("Ali");   // 4
        names.add("Symeye"); //5
        names.add("Shukir");
        names.add("Marika");
        names.add("Marika");

        for (String each : names) {
            if(names.indexOf(each)== names.lastIndexOf(each)){
                System.out.println(each);
              //  break;

            }
        }

    }
}
