package day32_finalKeyword.CarTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Tesla extends Car{
    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    public void start(){
        System.out.println("Say \"Start\" to start " +getMake()+" "+getModel());
    }

    @Override
    public void setModel(String model) {
        ArrayList<String> models = new ArrayList<>();
        models.addAll(Arrays.asList("Model S","Model Y","Model x","Model 3"));
        if(!models.contains(model)){
            System.err.println("Invalid Tesla model: "+model);
            System.exit(1);
        }
        super.setModel(model);
    }

    public final void autoPilot(){
       System.out.println(getMake()+" "+getModel()+" is in self-driving mode");
   }

    @Override
    public void setColor(String color) {
        super.setColor(color);
   String[] colors = {"Black","White","Blue","Brown","Green","Silver", "Red"};
   if(!Arrays.asList(colors).contains(color)){
       System.err.println("Invalid color of the Tesla "+color);
       System.exit(1);
   }

    }
    @Override
    public void setPrice(double price) {
        if(price < 50000){
            System.err.println("Invalid Tesla car price "+price);
            System.exit(1);
        }
        super.setPrice(price);

    }

    @Override
    public void setYear(int year) {
        if(year < 2008){
            System.err.println("Invalid year "+year);
            System.exit(1);
        }
        super.setYear(year);
    }
}
