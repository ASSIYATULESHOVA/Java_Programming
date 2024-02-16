package day33_abstraction.EmployeeTask;

public class Driver extends Employee{
    public Driver(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is driving.");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating sushi.");
    }
}
