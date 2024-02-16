package day17_customClass;

public class Dog {

    public String name;
    public String breed;
    public char gender;
    public int age;
    public String size;
    public String color;

    public void setInfo(String name, String breed, char gender, int age, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

public void eat(){
    System.out.println(name +" is eating");
}

public void drink(){
    System.out.println(name+" is drinking");
}


}
