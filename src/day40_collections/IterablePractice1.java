package day40_collections;

import java.util.*;

public class IterablePractice1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll( Arrays.asList(100));
        Iterator<Integer> iterator = list.iterator();
        System.out.println(iterator.hasNext());

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd","John","Ercon","Daniel","Mustafa","Mohammed","Ahmed","ahmed","Yuliia","Chris"
        ));

    /*    names.removeIf( each -> each.equalsIgnoreCase("ahmed"));
        System.out.println(names);

     */

      Iterator<String> it = names.iterator();

      while (it.hasNext()){
      String each = it.next();
      if(each.equalsIgnoreCase("ahmed")){
          it.remove();
      }
      }
        System.out.println("While loop "+names);

        System.out.println("---------------------------------------------------------");

       List<Integer> numbers = new ArrayList<>();
       numbers.addAll( Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9));

       int n = 5;


        for (int i = 0; i < n-1; i++) {
            numbers.removeIf(p -> Collections.max(numbers) == p);
        }

        int max = Collections.max(numbers);
        System.out.println(max);







    }
}
