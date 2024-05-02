package day29_Inheritance.Student;

public class Student {

 private String name;

    public String getName() {
        if(name == null){
            name = "Unknown";
        }
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            System.err.println("Invalid student name");
            System.exit(1);
        }
        this.name = name;
    }
private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
            System.err.println("Age can not be negative");
            System.exit(1);
        }
        if(age <5 || age > 90){
            System.err.println("Invalid age "+age);
            System.exit(1);
        }
        this.age = age;
    }
private char gender;
private char grade;

private String schoolName;


    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender == 'M' || gender == 'F'){
        }else{
            System.err.println("Invalid gender "+gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        boolean isValid = grade == 'A' || grade =='B' || grade == 'C' || grade == 'D' || grade == 'F';
        if(isValid){
            this.grade = grade;
        }else{
            System.err.println("Invalid grade "+grade);
            System.exit(1);
        }

    }

    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
       setGender(gender);
       setGrade(grade);
        setSchoolName(schoolName);
    }

    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender()+
                ", grade=" + getGrade() +
                ", schoolName='" + getSchoolName()+ '\'' +
                '}';
    }

    public void Study(){
        System.out.println(name+ " is studying at "+schoolName);
    }
}
