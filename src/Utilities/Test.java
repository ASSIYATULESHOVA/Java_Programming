package Utilities;
import day27_accessModifiers.AccessModifiers;
import day27_accessModifiers.Data;
public class Test {

    public static void main(String[] args) {

        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);

   Data.method3();
   Data.method4();


   Data obj = new Data();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);


        obj.method1();
        obj.method2();


        System.out.println("===============================");

        System.out.println(AccessModifiers.publicDate);

       // System.out.println(AccessModifiers.protectedData); protected is not always accesable

        //System.out.println(AccessModifiers.defaultData); default is never accesable within

        // System.out.println(AccessModifiers.privateData); can  not be used

      new  AccessModifiers();


      AccessModifiers.publicMethod();
      // AccessModifiers.defaultMethod();
        







    }


}
