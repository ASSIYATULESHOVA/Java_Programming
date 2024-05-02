package day26_Static;

public class IPhone {

    public static String brand = "Apple";
    public String model , size;
    public String color;

    public double price;
    public static  String OS = "iOS";
    public static String madeIn = "China";

    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;

    public static boolean isExpensiveToFix = true;

 public void printPhoneInfo(){
     System.out.println("Brand: "+ brand);
     System.out.println("Model: "+ model);
     System.out.println("Color: "+ color);
     System.out.println("Price: "+ price);
 }
 public static void printOS(){
     System.out.println("Operating System: "+ OS);
 }

    public IPhone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
}
