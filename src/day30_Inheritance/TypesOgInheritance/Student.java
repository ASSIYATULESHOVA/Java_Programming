package day30_Inheritance.TypesOgInheritance;

import java.time.LocalDate;

public class Student extends Person{

    private char grade;
    private String studentId;
    public Student(String name, char gender, LocalDate DOB, char grade, String studentId) {
        super(name, gender, DOB);
        setGrade(grade);
        setStudentId(studentId);
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
      if(grade=='A'|| grade =='B' || grade=='C'|| grade=='D' || grade =='F'){
          this.grade = grade;
      }else{
          System.err.println("Invalid grade");
      }
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void study(){
        System.out.println(getName()+" is studying");
    }









}
