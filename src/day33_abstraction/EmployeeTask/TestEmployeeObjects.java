package day33_abstraction.EmployeeTask;

public class  TestEmployeeObjects {
    public static void main(String[] args) {

    Developer developer = new Developer("James",30,'M',"A01","Developer",120000,"Java");
    Teacher teacher = new Teacher("Molly",35,'F',"A01","Math teacher",100000);
    Driver driver = new Driver("Alex",45,'M',"A03","Truck driver",900000);
    Tester tester = new Tester("Asiya",28,'F',"A04","SDET",150000);

        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);
        System.out.println(tester);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

     developer.work();
     teacher.work();
     tester.work();
     driver.work();

     System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

     developer.eat();





    }
}
