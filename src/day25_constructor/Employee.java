package day25_constructor;
import java.time.LocalDate;
public class Employee {

   public String name ;
   public int aga;
   public char gender;
   public String jobTitle;
   public double salary;

   public LocalDate hireDate;

    public Employee(String name, int aga, char gender, String jobTitle, double salary, LocalDate hireDate) {
        this.name = name;
        this.aga = aga;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", aga=" + aga +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                '}';
    }
}
