package day35_polymorphysm.TransportationTask;

public class Audi extends Car implements AutoPark{


    public Audi(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+" "+getModel()+" has auto park mode.");
    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }
}
