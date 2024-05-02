package day34_abstraction.AnimalTask;

public class Parrot extends Animal implements Playable, Flyable{
    public Parrot(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating corn");
    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing with cat.");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" is flying to Niko.");
    }
}
