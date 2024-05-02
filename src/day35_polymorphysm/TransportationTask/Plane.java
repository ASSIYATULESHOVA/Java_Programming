package day35_polymorphysm.TransportationTask;

import day34_abstraction.AnimalTask.Flyable;

public abstract class Plane extends Transportation implements Flyable {
    public Plane(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    public void land(){
        System.out.println("Landing "+getMake()+" "+getModel());
    }

   public void fly(){
       System.out.println(getMake()+" "+getModel()+" is flying.");
   }
}
