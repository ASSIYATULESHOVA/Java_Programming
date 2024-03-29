package day34_abstraction.AnimalTask;

public class Dolphin extends Animal implements Playable,Swimmable{
    public Dolphin(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating fish.");
    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing with people.");
    }

    @Override
    public void swim() {
        System.out.println(getName()+" is swimming in the pool.");
    }
}
