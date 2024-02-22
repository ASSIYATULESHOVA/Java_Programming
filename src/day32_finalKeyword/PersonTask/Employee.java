package day32_finalKeyword.PersonTask;

import java.time.LocalDate;

public class Employee extends Person{

    private String jobTitle;
    private double salary;

    public Employee(String name,  char gender, LocalDate dateOfBirth,String jobTitle,double salary) {
        super(name, gender, dateOfBirth);
      setJobTitle(jobTitle);
      setSalary(salary);
      setJobTitle(jobTitle);
      setSalary(salary);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName()+" is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", dateOfBirth=" + getDateOfBirth() +
                ", job title =" + getJobTitle() +
                ", salary =" + getSalary() +

                '}';
    }
}
