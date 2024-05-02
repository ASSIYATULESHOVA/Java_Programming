package day30_Inheritance.PhoneTask;

public class Samsung extends Phone {


    public Samsung(String model, String size, String color, double price) {
        super("Samsung", model, size, color, price);
    }

    public static boolean hasSamsungPay = true;

    public void freeze(){
        System.out.println(getBrand()+" "+getModel()+" freezes a lot");
    }

}
