package day18_garbageCollection;


import day17_customClass.Employee;

class Car{
    public String brand, model, color;
    public int year;
}
public class MemoryAllocation {

    public static void main(String[] args) {
        int a = 100;

        Car car = new Car();
        // stack     heap

        System.out.println("---------------------------");

        Employee employee1 = new Employee();
        Employee employee2 = employee1;

        employee1.setInfo("Rehane", 30, 'F', "Java Developer",95000, "A12");

        System.out.println(employee1);
        System.out.println(employee2);


        System.out.println("-----------------------------------------");

        String batch1 = new String("Java");
        String batch2 = batch1;
        String batch3 = batch1;

    }

}
