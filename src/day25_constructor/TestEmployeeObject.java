package day25_constructor;

import java.time.LocalDate;

public class TestEmployeeObject {
    public static void main(String[] args) {

   Employee employee1 = new Employee("Molly",29,'F',"Developer",150000, LocalDate.of(2023,10,01));
        System.out.println(employee1);
        Employee employee2 = new Employee("Assiya",28,'F',"Developer",200000,LocalDate.of(2024,10,9));
        System.out.println(employee2);
Employee employee3 = new Employee("David",35,'M',"US Marshall",120000,LocalDate.of(2016,07,01));
        System.out.println(employee3);





    }
}
