package day32_finalKeyword.PersonTask;

import java.time.LocalDate;

public class Person {

   private String name;
   private final int age;
   private final char gender;
   private final LocalDate dateOfBirth;

   public Person(String name, char gender, LocalDate dateOfBirth) {
      setName(name);
      this.gender = gender;
      if(!(gender =='M' || gender =='F')){
         System.err.println("Invalid gender "+gender);
         System.exit(1);
      }
      this.age = LocalDate.now().getYear() - dateOfBirth.getYear();
      if(age <= 0){
         System.err.println("Invalid age "+age);
         System.exit(1);
      }

      this.dateOfBirth = dateOfBirth;
   }

   public static final int numberOfHead;

   static{
      numberOfHead =1;
   }

   public void eat(){
       System.out.println(name+" is eating");
   }
   public final void breath(){
      System.out.println(name+" is breathing");
   }
   public void drink(){
      System.out.println(name+" is drinking");
   }
   public void sleep(){
      System.out.println(name+" is sleeping");
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getName() {
      return name;
   }
   public int getAge() {
      return age;
   }
   public char getGender() {
      return gender;
   }
   public LocalDate getDateOfBirth() {
      return dateOfBirth;
   }

   public String toString() {
      return "Person{" +
              "name='" + name + '\'' +
              ", age=" + age +
              ", gender=" + gender +
              ", dateOfBirth=" + dateOfBirth +
              '}';
   }
}
