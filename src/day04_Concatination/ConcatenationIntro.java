package day04_Concatination;

public class ConcatenationIntro {
    public static void main(String[] args) {

        String name = "Alexander";
        int age = 28;
        int salary = 85_000;
        System.out.println("Hello "+name+".");
        System.out.println("You are "+age +" years old.");
        System.out.println("Your salary is "+salary + " USD");

        System.out.println("--------------------------------");

        int number = 100_000_000;

        System.out.println("Number = "+number);
    }
}
