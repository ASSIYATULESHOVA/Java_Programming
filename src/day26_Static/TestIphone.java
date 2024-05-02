package day26_Static;

public class TestIphone {
    public static void main(String[] args) {

IPhone iPhone = new IPhone("Iphone12","Black",1000);
        System.out.println(iPhone.model);
        System.out.println(iPhone.color);
        System.out.println(iPhone.price);

        iPhone.printPhoneInfo();

        System.out.println(IPhone.brand);
        System.out.println(IPhone.madeIn);
        System.out.println(IPhone.hasBattery);
        System.out.println(IPhone.isExpensiveToFix);
        IPhone.printOS();




    }
}
