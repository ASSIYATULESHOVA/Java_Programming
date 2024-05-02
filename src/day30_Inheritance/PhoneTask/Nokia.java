package day30_Inheritance.PhoneTask;

public class Nokia extends Phone {
    public Nokia( String model, String size, String color, double price) {
        super("Nokia", model, size, color, price);
    }

    public void selfDefence(){
        System.out.println(getBrand()+" "+getModel()+" can be used for self defence");
    }
}
