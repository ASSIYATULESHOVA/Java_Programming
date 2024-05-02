package day34_abstraction.AnimalTask;

public class Shark extends Animal implements wild,Swimmable{
    public Shark(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating fish");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting to whales");
    }

    @Override
    public void swim() {
        System.out.println(getName()+" is swimming in the ocean.");
    }
}
