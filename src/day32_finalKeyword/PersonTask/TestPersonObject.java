package day32_finalKeyword.PersonTask;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {
        Person person = new Person("Molly",'F', LocalDate.of(1994,8,27));
        Employee employee = new Employee("Asiya",'F',
                LocalDate.of(1995,10,9),"Programmer",150000);

        System.out.println(person);
        System.out.println(employee);


    }
}
