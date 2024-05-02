package day39_Collections;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println(list);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(10,200,300,40,90));
        set1.addAll(Arrays.asList(10,200,300,40,90));
        set1.addAll(Arrays.asList(10,200,300,40,90));
        set1.addAll(Arrays.asList(10,200,300,40,90));
        set1.addAll(Arrays.asList(null,null,null,null,null));

        System.out.println(set1);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Set<Integer> set2 = new LinkedHashSet<>();

        set2.addAll(Arrays.asList(10,200,300,40,90));
        set2.addAll(Arrays.asList(10,200,300,40,90));
        set2.addAll(Arrays.asList(10,200,300,40,90));
        set2.addAll(Arrays.asList(10,200,300,40,90));
        set2.addAll(Arrays.asList(null,null,null,null,null));
        System.out.println(set2);


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Set<Integer> set3 = new TreeSet<>();
        set3.addAll(Arrays.asList(10,200,300,40,90));
        set3.addAll(Arrays.asList(10,200,300,40,90));
        set3.addAll(Arrays.asList(10,200,300,40,90));
      //  set3.addAll(Arrays.asList(null,null,null,null,null)); null is not allowed

        System.out.println(set3);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        String[] words = { "Java","Java","Java", "Python","Python", "C#" , "C++", "Ruby","C#","C3"};

        Set<String> result = new LinkedHashSet<>();
        result.addAll( Arrays.asList(words));
        System.out.println(result);
/*
        for (String each : result) {
            System.out.println(each);
        }
 */

        System.out.println( new ArrayList<>(result).get(1));

        words = result.toArray(new String[0]);
        System.out.println(Arrays.toString(words));

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        List<Integer> numbers = new ArrayList<>();

        numbers.addAll( Arrays.asList(10,10,10,20,20,30,30,30,40,40,40,40,50,50,50,50,5,5,5,5,2,2,1,1));

        Set<Integer> n = new TreeSet<>(numbers);
        System.out.println(n);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");




    }

}
