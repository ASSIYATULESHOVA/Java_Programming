package day36_Polymorphism;

import day29_Inheritance.AnimalTask.Animal;
import day29_Inheritance.AnimalTask.Cat;
import day29_Inheritance.AnimalTask.Dog;
import day30_Inheritance.PhoneTask.Nokia;
import day30_Inheritance.PhoneTask.Phone;
import day33_abstraction.EmployeeTask.Developer;
import day33_abstraction.EmployeeTask.Employee;
import day33_abstraction.EmployeeTask.Tester;
import day35_polymorphysm.TransportationTask.AutoPilot;
import day35_polymorphysm.TransportationTask.Electric;
import day35_polymorphysm.TransportationTask.Tesla;

public class ReferenceTypeCasting {
    public static void main(String[] args) {

          Dog dog = new Dog();
      //  Cat cat = new Dog();

        Animal animal = (Animal) new Dog(); // Implicit casting

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Animal animal1 = new Dog();
        animal1.setInfo("Max","Husky","Large","White",'M',4);
        animal1.eat();
        animal1.sleep();
        animal1.drink();

        ((Dog)animal1).bark(); // DOWN CASTING
        //Dog dog1 = (Dog)animal1;   // Down casting
     //  dog1.bark();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

       // ((Cat)animal1).scratch();  Dog can not be Casted to Cat ni is Relationship

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Phone phone = new Nokia("XR20","Small","Black",350);

  phone.call(929385750);
  phone.text(928954478);
        ((Nokia)phone).selfDefence();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Employee employee = new Developer("Lucy",30,'F',"C1","Java Developer",100000,"Java");
        employee.work();
        System.out.println(((Developer) employee).getProgrammingLanguage());

      //  Tester tester = (Tester) employee;

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Electric electric = new Tesla("Tesla","Model Y","Blue",2020,55000);
        electric.charge();

        ((Tesla) electric).selfDrive();
        ( (AutoPilot)electric).selfDrive();
        



    }
}
