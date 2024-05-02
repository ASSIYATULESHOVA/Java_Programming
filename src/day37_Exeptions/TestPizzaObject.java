package day37_Exeptions;

public class TestPizzaObject {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza('S',1,3);
        Pizza pizza2 = new Pizza('S',1,3);
        Pizza pizza3 = new Pizza('M',1,3);

      //  System.out.println(pizza1 == pizza2); false
        System.out.println(pizza1.equals(pizza2)); // true
        System.out.println(pizza2.equals(pizza3)); // false
       // System.out.println(pizza1.equals("Pizza"));  Invalid Object

        Object obj = new Pizza('S',4,3);
        double total = ( (Pizza)obj ).calcCost();
        System.out.println(total);

        



    }
}
