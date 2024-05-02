package day34_abstraction.CarTask;

public class TestCarObjects {
    public static void main(String[] args) {

        Honda honda = new Honda("Accord","White",2020,40000);
        System.out.println(honda);
        Audi audi = new Audi("Q5","Black",2023,45000);
        System.out.println(audi);
        Tesla tesla = new Tesla("Model Y","Blue",2022,55000);
        System.out.println(tesla);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        honda.start();
        audi.start();
        tesla.start();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        honda.stop();
        audi.stop();
        tesla.stop();


    }
}
