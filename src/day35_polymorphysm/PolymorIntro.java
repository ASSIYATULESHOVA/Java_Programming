package day35_polymorphysm;

import day27_accessModifiers.Circle;
import day33_abstraction.EmployeeTask.Developer;
import day33_abstraction.EmployeeTask.Employee;
import day34_abstraction.AnimalTask.*;
import day34_abstraction.CarTask.Tesla;

import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public class PolymorIntro {
    public static void main(String[] args) {

        Dog dog = new Dog("Max","Husky","Small","White",4,'M');
        Cat cat = new Cat("Max","Breed","Small","White",4,'M');
        Lion lion = new Lion("ASIYA","Human","Medium","White",1,'F');
        Dolphin dolphin = new Dolphin("Anna","Pool","Medium","Blue",5,'F');

       Animal[] animals = {dog,cat, lion ,dolphin};

       lion.eat();
       dog.play();

        System.out.println("+++++++++++++++++++++++");

        String str = "Java";
        Integer n = 200;
        Boolean r = false;
        Double b = 10.5;
      Circle circle = new Circle(4);

        Object[] objects = {str, n, r , circle , b}; // can store anything
        System.out.println(Arrays.toString(objects));

        Employee obj = new Developer("Lucy",28,'F',"A01","SDET",120000,"Java");
        obj.work();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

Tesla tesla = new Tesla("Model Y","White",2022,45000);
 tesla.start();



    }
}
