package day27_accessModifiers;

public class TestCydeoStudent {
    public static void main(String[] args) {


     CydeoStudent student1 = new CydeoStudent("Asiya", 28,'F');
     CydeoStudent student2 = new CydeoStudent("David",34,'M');

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.schoolName);
        System.out.println(student2.secretCode);

        System.out.println(student2.schoolName);
        System.out.println(student1.secretCode);

        

    }
}
