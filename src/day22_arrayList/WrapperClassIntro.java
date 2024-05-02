package day22_arrayList;

public class WrapperClassIntro {
    public static void main(String[] args) {

    String str = "Java";
    int a1 = 10;    // will not be supported in wrapper class
    Integer a2 = 10; // wrapper class

        System.out.println("----------------------------------------");

      int b1 = 100;

      double b5 = b1; // implicitly casted

      Integer b2 = b1; // AUTOBOXING
      // Long b3 = b1;   can not autobox for different

        char ch = 'A';
        Character ch1 = ch; // auto boxing

        byte b12 = 12;
        Byte b13 = b12; // auto boxing

        double d = 2.5;
        Double d1 = d; // auto boxing

        System.out.println("-----------------------------------------------");

        Integer n1 = 20;
        int n2 = n1;  // UNBOXING
      //  long n3 = n1;           BETTER USE ITS OWIN PRIMITIVE
        //double n4 = n1;

        Character ch4 = 'Z';
        char ch5 = ch4; // unboxing





















    }
}
