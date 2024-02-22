package day34_abstraction.AnimalTask;

public class Eagle extends Animal implements Flyable{
    public Eagle(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating snake.");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" is flying very high.");
    }
}
