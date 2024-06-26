package day24_DateAndTime;

import java.time.LocalDate;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;

    public void setInfo(String name,  char gender, LocalDate dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        age = LocalDate.now().getYear()- dateOfBirth.getYear();

    }

    public String toString() {
        return "" +
                "\nname = " + name + '\'' +
                ",\nage = " + age +
                ",\ngender = " + gender +
                ",\ndateOfBirth = " + dateOfBirth +
                ",\n-----------------------------"+
                '}';
    }
}
