package day34_abstraction.AnimalTask;

public class Duck extends Animal implements Playable, Flyable,Swimmable{
    public Duck(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating mouse");
    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing with people.");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" is flying to the tree.");
    }

    @Override
    public void swim() {
        System.out.println(getName()+" is swimming in the shore.");
    }
}
