package day34_abstraction.AnimalTask;

public abstract class Animal {

 private String name, breed, size, color;
 private int age;
 private char gender;

 public Animal(String name, String breed, String size, String color, int age, char gender) {
  setName(name);
  setBreed(breed);
  setSize(size);
  setColor(color);
  setAge(age);
  setGender(gender);
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getBreed() {
  return breed;
 }

 public void setBreed(String breed) {
  this.breed = breed;
 }

 public String getSize() {
  return size;
 }

 public void setSize(String size) {
  this.size = size;
 }

 public String getColor() {
  return color;
 }

 public void setColor(String color) {
  this.color = color;
 }

 public int getAge() {
  return age;
 }

 public void setAge(int age) {
  this.age = age;
 }

 public char getGender() {
  return gender;
 }

 public void setGender(char gender) {
  this.gender = gender;
 }

 public void drink(){
  System.out.println(getName()+" is drinking water");
 }

 public abstract void eat();

 public void sleep(){
  System.out.println(name+" sleeps 8 hours");
 }

 public String toString() {
  return getClass().getSimpleName()+"{" +
          "name='" + getName()+ '\'' +
          ", breed='" + getBreed() + '\'' +
          ", size='" + getSize() + '\'' +
          ", color='" + getColor() + '\'' +
          ", age=" + getAge() +
          ", gender=" + getGender() +
          '}';
 }


}
