package day33_abstraction.EmployeeTask;

public class Developer extends Employee {

    private String programmingLanguage;

    @Override
    public String toString() {
        return "Developer{" +
                "name = " + getName() + '\'' +
                ", age = " + getAge() +
                ", gender = " + getGender() +
                ", id = " + getId() + '\'' +
                ", jobTitle = " + getJobTitle() + '\'' +
                ", salary = " + getSalary() +
                "programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }

    public Developer(String name, int age, char gender, String id, String jobTitle, double salary, String programmingLanguage) {
        super(name, age, gender, id, jobTitle, salary);
        setProgrammingLanguage(programmingLanguage);
    }
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(getName()+" is coding in "+programmingLanguage);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating sandwich");

    }
}
