package day34_abstraction.AnimalTask;

public class Dog extends Animal implements Playable{
    public Dog(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating dog food.");
    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing with kids.");
    }
}
