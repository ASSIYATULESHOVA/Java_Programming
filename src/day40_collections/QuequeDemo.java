package day40_collections;

import java.util.*;

public class QuequeDemo {
    public static void main(String[] args) {


        Queue<Integer> queue1 = new PriorityQueue<>();
        queue1.addAll( Arrays.asList(10,200,300,40,90));
        queue1.addAll( Arrays.asList(10,200,300,40,90));   // order is random
        queue1.addAll( Arrays.asList(10,200,300,40,90));
        queue1.addAll( Arrays.asList(10,200,300,40,90));
     //   queue1.addAll( Arrays.asList(null,null, null)); does not accept null
        System.out.println(queue1);
        int num1 = queue1.poll();  // FIFO
        System.out.println(queue1);

        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        Queue<Integer> queue2 = new ArrayDeque<>();
        queue2.addAll( Arrays.asList(10,200,300,40,90));
        queue2.addAll( Arrays.asList(10,200,300,40,90));   // order is kept
        queue2.addAll( Arrays.asList(10,200,300,40,90));
        queue2.addAll( Arrays.asList(10,200,300,40,90));

        System.out.println(queue2);
        queue2.poll();
        queue2.poll();
        System.out.println(queue2); // elements will be removed


        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        Queue<Integer> queue3 = new LinkedList<>();

        queue3.addAll( Arrays.asList(10,200,300,40,90));
        queue3.addAll( Arrays.asList(10,200,300,40,90));   // order is kept
        queue3.addAll( Arrays.asList(10,200,300,40,90));
        queue3.addAll( Arrays.asList(10,200,300,40,90));
        queue3.addAll( Arrays.asList(null,null, null));   // accepts null
        System.out.println(queue3);

        queue3.poll();
        queue3.poll();
        queue3.poll();

        System.out.println(queue3);

        System.out.println( ((LinkedList)queue3).get(4));

        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        List<Integer> list = new LinkedList<>();
        list.addAll( Arrays.asList( 10,200,300,40,90));

        System.out.println(list.get(1));

      ( (LinkedList)list).poll();
        System.out.println(list);

        ((Stack)list).pop();
      //  System.out.println(list);



    }
}
