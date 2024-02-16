package day23_ArrayList;

import java.util.ArrayList;

public class averageNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(20); //0
        list.add(30);//1
        list.add(40); //2
        list.add(50); //3
        list.add(60);  //4
        list.add(70);  //5
        System.out.println(list);

     int sum = 0;

        for (Integer each : list) {
            sum += each;
        }
       double average = sum/ (double)list.size();

        System.out.println(average);







    }
}
