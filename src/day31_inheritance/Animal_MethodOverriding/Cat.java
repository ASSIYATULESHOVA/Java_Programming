package day31_inheritance.Animal_MethodOverriding;

public class Cat extends Animal{

    public Cat(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("Cat "+getName()+" is eating cat food");
    }
    public void sleep(){
        System.out.println("Cat "+getName()+" is sleeps 12 hours in a day");
    }

    public void scratch(){
        System.out.println("Cat "+getName()+" is scratching");
    }
}
