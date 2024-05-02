package day34_abstraction.AnimalTask;

public class Tiger extends Animal implements wild{
    public Tiger(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating lion");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting to deer");
    }
}
