package day29_Inheritance.AnimalTask;

public class Animal {
    public String name;
    public String breed;
    public String size;
    public String color;
    public char gender;
    public int age;

    public static boolean isAnimal;

    static{
        isAnimal = true;
    }

    
    public void eat(){
        System.out.println(name + " is eating");
    }

    public void drink(){
        System.out.println(name+" is drinking");
    }

    public void sleep(){
        System.out.println(name+ " is sleeping");
    }

    public String toString() {

        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    public void setInfo(String name, String breed, String size, String color, char gender, int age) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
        this.age = age;
    }
}

