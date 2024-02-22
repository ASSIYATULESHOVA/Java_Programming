package day29_Inheritance.AnimalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Duke","Yorkie","Small","Brown",'M',6);
        System.out.println(dog);
        dog.bark();
        dog.eat();

        Cat cat = new Cat();
        cat.setInfo("Mars","Russian Blue","Large","Golden",'M',3);
        System.out.println(cat);
        cat.meow();
        cat.drink();
        cat.scratch();

        Tiger tiger = new Tiger();
        tiger.setInfo("Jupiter","Bengali","Medium","White",'F',5);
        System.out.println(tiger);
        tiger.hunt();
        tiger.sleep();









    }
}
