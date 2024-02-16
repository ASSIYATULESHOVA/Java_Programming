package day31_inheritance.Animal_MethodOverriding;

public class Dog extends Animal {
    public Dog(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

   public void eat(){
       System.out.println("Dog "+getName()+" is eating dog food");
   }
   public void sleep(){
       System.out.println("Dog "+getName()+" sleeps 8 hours in a day");
   }

   public void bark(){
       System.out.println("Dog "+getName()+" is barking");
   }



}
