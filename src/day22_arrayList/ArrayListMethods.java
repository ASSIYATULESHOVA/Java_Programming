package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10); //0
        list.add(20); //1
        list.add(30);//2
        list.add(10);// 3
        list.add(25); // 4

        System.out.println(list);


       list.add(1,15);
        System.out.println(list);

       list.add(2,25);
        System.out.println(list);

        System.out.println("======================================================");

        ArrayList<String> studentList = new ArrayList<>();

        studentList.add("Molly");
        studentList.add("Monica");
        studentList.add("Melody");
        studentList.add("Melanie");

        System.out.println(studentList.size());
        System.out.println(studentList);

       String firstStudent = studentList.get(0);
        System.out.println(firstStudent);

        String lastStudent = studentList.get(studentList.size()-1);
        System.out.println(lastStudent);

        System.out.println("====================================================");


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(3,255);
        numbers.add(0,570);

        System.out.println(numbers); // 570,200,300,255,500;
        System.out.println("===========================================");



        for (int i = 0; i < numbers.size(); i++) {
            int each = numbers.get(i);
            System.out.println(each);
        }
        System.out.println("==================================");


        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }

        System.out.println("==================================");

        for (Integer each : numbers) {
            System.out.println(each);
        }







    }
}
