package day34_abstraction.AnimalTask;

public class Lion extends Animal implements wild{
    public Lion(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating deer");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting to dogs");
    }
}
