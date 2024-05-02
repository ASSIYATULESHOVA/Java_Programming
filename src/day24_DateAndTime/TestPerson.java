package day24_DateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPerson {
    public static void main(String[] args) {

      Person[] people = { new Person(), new Person(), new Person(), new Person(),new Person()}  ;

      people[0].setInfo("Daniel",'M', LocalDate.of(1958,2,24));
      people[1].setInfo("Molly",'F',LocalDate.of(1994,8,27));
      people[2].setInfo("Katya",'F',LocalDate.of(1978,3,7));
      people[3].setInfo("Michelle",'F',LocalDate.of(1996,4,2));
      people[4].setInfo("Edward",'M',LocalDate.of(2000,9,23));

        ArrayList<Person> studentList = new ArrayList<>();

        studentList.addAll(Arrays.asList( people));

        System.out.println(studentList.get(0).name+" DOB "+LocalDate.of(1958,2,24));
        System.out.println(studentList.get(1).name+" DOB "+LocalDate.of(1964,8,27));
        System.out.println(studentList.get(2).name+" DOB "+LocalDate.of(1978,3,7));
        System.out.println(studentList.get(3).name+" DOB "+LocalDate.of(1996,4,2));
        System.out.println(studentList.get(4).name+" DOB "+LocalDate.of(2000,9,23));

        studentList.removeIf(g -> g.age > 55);
      System.out.println(studentList);



    }
}
