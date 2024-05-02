package day31_inheritance.Animal_MethodOverriding;

public class TestAnimalObjects {
    public static void main(String[] args) {
        Cat cat = new Cat("Mars","Bengle","Large","Golden",3,'M');
        Dog dog = new Dog("Duke","Yorkie","Small","Black",6,'M');
        Lion lion = new Lion("Simba","African lion","Large","Yellow",5,'F',true);
        Eagle eagle = new Eagle("Bella","Kazakh Eagle","Medium","White",4,'F');

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);

        System.out.println("+++++++++++++++++++++++++++++++++++++");

        cat.eat();
        dog.eat();
        lion.eat();
        eagle.eat();

        System.out.println("+++++++++++++++++++++++++++++++++++++");

        cat.drink();
        eagle.fly();
        lion.roar();
        dog.bark();
        System.out.println("+++++++++++++++++++++++++++++++++++++");

        cat.sleep();
        dog.sleep();

    }
}
