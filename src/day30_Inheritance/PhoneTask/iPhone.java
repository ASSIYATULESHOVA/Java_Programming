package day30_Inheritance.PhoneTask;

public class iPhone extends Phone{


    public iPhone(String model, String size, String color, double price){
      super("Apple",model,size,color,price);
    }
    public static boolean hasApplePay = true;
    public void faceTime(long phoneNumber){
        System.out.println(getModel()+" is FaceTiming with "+phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(getModel()+" is FaceTiming with "+email);
    }


}
