package day28_OOP.Person;

public class Person {
   public String name;
   public int age;
   public char gender;
   public String language;

public static String planet;
public static boolean isHuman, hasNose;
public static int numberOfWings, numberOfHead;


   public Person(String name) {
      this.name = name;
   }

   public Person(String name, int age) {
      this(name);
      this.age = age;
   }

   public Person(String name, String language) {
      this(name);
      this.language = language;
   }

   public Person(String name, char gender) {
      this(name);
      this.gender = gender;
   }

   public Person(String name, int age, char gender) {
      this(name,age);
      this.gender = gender;
   }

   public Person(String name, int age, char gender, String language) {
      this(name, age, gender);
      this.language = language;
   }

   static{
      planet = "Earth";
      isHuman = true;
      hasNose = true;
      numberOfWings = 0;
      numberOfHead = 1;
   }


   public static void printPlanetName(){
      System.out.println("Planet name is "+ planet);
   }
   public void eat(String food){
       System.out.println(name + " is eating " + food);
   }

   public void drink(String drink){
      System.out.println(name + " is drinking " + drink);
   }

   public String toString() {
      return "Person{" +
              "name ='" + name + '\'' +
              ", age =" + age +
              ", gender =" + gender +
              ", language ='" + language + '\'' +
              ", planet ='" + planet + '\'' +
              '}';
   }
}
