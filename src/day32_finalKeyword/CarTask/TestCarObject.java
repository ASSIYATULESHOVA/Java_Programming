package day32_finalKeyword.CarTask;

public class TestCarObject {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Rav4","White",2022,45000);

        Honda honda = new Honda("Accord","Gray",2019,25000);

        Audi audi = new Audi("Q7","Silver",2023,60000);

        BMW bmw = new BMW("X6","Black",2021,65000);

        Tesla tesla = new Tesla("Model Y","Red",2020,65000);
        System.out.println("=================================================");
        System.out.println(toyota);
        System.out.println(honda);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(tesla);
        System.out.println("=======================================");

        toyota.start();
        honda.start();
        audi.start();
        bmw.start();
        tesla.start();












    }
}
