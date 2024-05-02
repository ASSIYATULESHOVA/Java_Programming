package day26_Static.studentTask;

public class TestStudentObject {
    public static void main(String[] args) {

        Student st1 = new Student("Asiya",28,'F',"A01");
        System.out.println(st1);
        Student st2 = new Student("Molly",29,'F',"A02");
        System.out.println(st2);
        Student st3 = new Student("James" , 30,'M',"A03");
        System.out.println(st3);
        Student st4= new Student("James" , 30,'M',"A04");
        System.out.println(st4);
        Student st5 = new Student("James" , 30,'M',"A05");
        System.out.println(st5);

         //st1.study();

        StudentsGroup group1 = new StudentsGroup("Java Turtles", 1);
        group1.addStudent(st1);
        group1.addStudent(st2);
        group1.addStudent(st3);
        group1.addStudent(st4);
        group1.addStudent(st5);

        System.out.println(group1);

   group1.removeStudent("A03");
        System.out.println(group1);

        for (Student each : group1.students) {
            System.out.println(each.name + " "+each.id);
        }





    }
}
