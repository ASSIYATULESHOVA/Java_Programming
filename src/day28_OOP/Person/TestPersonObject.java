package day28_OOP.Person;

public class TestPersonObject {
    public static void main(String[] args) {

        Person person1 = new Person("James");

        Person person2 = new Person("Asiya",'M');

        Person person3 = new Person("Hasan", 30);

        Person person4 = new Person("Molly","English");

        Person person5 = new Person("David", 34,'M');

        Person person6 = new Person("Lucy", 31, 'F', "English");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);

        Person.printPlanetName();

        person1.eat("Salad");

        person2.drink("Cosmopolitan");



    }
}
