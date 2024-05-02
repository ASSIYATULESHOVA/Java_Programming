package day30_Inheritance.TypesOgInheritance;

import java.time.LocalDate;

public class TestPersonObjects {

    public static void main(String[] args) {
        Student student = new Student("Asiya",'F', LocalDate.of(1995,10,9),'A',"A09");

        President president = new President("David", 'M',LocalDate.of(2030,12,25),LocalDate.of(2034,12,1));

        Teacher teacher = new Teacher("Emely", 'F',LocalDate.of(1980,2,15),"M12","Math",15000);


        student.drink("tea");
        teacher.eat("Manti");
        president.lie();








    }
}
