package day31_inheritance.Animal_MethodOverriding;

public class Eagle extends Animal {
    public Eagle(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

   public void eat(){
       System.out.println("Eagle "+getName()+" is eating a snake");
   }

   public void fly(){
       System.out.println("Eagle "+getName()+" is flying high");
   }




}
