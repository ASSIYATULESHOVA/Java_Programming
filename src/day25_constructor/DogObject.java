package day25_constructor;

import day17_customClass.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObject {
    public static void main(String[] args) {

        Dog[] dogs = { new Dog(),new Dog(),new Dog(),new Dog(),new Dog(),new Dog()};
        dogs[0].setInfo("Max","Husky",'M',4,"Medium","Gray" );
        dogs[1].setInfo("Chloe","Golden Retriever",'F',8,"Large","Gold" );
        dogs[2].setInfo("Molly","Beagle",'F',5,"Small","White" );
        dogs[3].setInfo("Oliver","Bulldog",'M',2,"Small","Black" );
        dogs[4].setInfo("Bella","Bichon Frise",'F',3,"Small","White" );
        dogs[5].setInfo("Loki","Chow Chow",'M',7,"Medium","Gold" );

        
        ArrayList<Dog> smallDogs = new ArrayList<>(Arrays.asList(dogs)) ;

        smallDogs.removeIf( p -> !p.size.equals("Small"));

/*
     for (Dog each: smallDogs) {
            if(dog.size.equals("Small")){
                smallDogs.add(dog);
            }
        } */

        System.out.println(smallDogs);

ArrayList<Dog> youngDogs = new ArrayList<>( Arrays.asList(dogs));

youngDogs.removeIf( p -> p.age > 4);
/*        for (Dog each : youngDogs) {
            if(each.age <= 4){
                youngDogs.add(each);
            }
        }     */

        System.out.println(youngDogs);


        ArrayList<Dog> femaleDogs = new ArrayList<>();
        femaleDogs.removeIf( p -> p.gender == 'M');
        System.out.println(femaleDogs);

        ArrayList<Dog> maleDogs = new ArrayList<>();
        maleDogs.removeIf( p -> p.gender == 'F');
        System.out.println(maleDogs);

        System.out.println("================================================================");










    }
}
