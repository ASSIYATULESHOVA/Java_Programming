package day35_polymorphysm;

import day33_abstraction.EmployeeTask.Employee;
import day34_abstraction.AnimalTask.*;
import day34_abstraction.CarTask.Car;
import day34_abstraction.CarTask.Tesla;
import day35_polymorphysm.TransportationTask.CydeoCar;

import java.awt.image.AreaAveragingScaleFilter;

public class PolyPractice {
    public static void main(String[] args) {


        Animal tiger = new Tiger("Sher","Bengal","Large","Yellow",5,'M');
        tiger.sleep();
        tiger.drink();
      //  tiger.hunt(); can not call it from Tiger class
        tiger.eat();

        Animal animal = new Eagle("Jo","American Eagle","Large","Black",6,'M');
      //  animal.fly();
       animal.eat();
       animal.sleep();
       animal.drink();

        Flyable obj1 = new Eagle("JOhn" ,"American Eagle","Large","Black",6,'M');

        Lion lion = null;
        Parrot parrot = null;
        Eagle eagle = null;
        Dolphin dolphin = null;
        Shark shark = null;
        Duck duck = null;
        Cat cat = null;
        Dog dog = null;
        CydeoCar cydeoCar = null;

        Flyable [] birds= { eagle, parrot, duck} ;
        Swimmable[] fishes = {shark, duck, dolphin, cydeoCar};
        Playable[] play = {parrot,duck, cat, dog};

       // boolean isAnimal = cydeoCar instanceof Animal;
boolean isAnimal = dog instanceof Animal; // true

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");








    }
}
