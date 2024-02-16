package day27_accessModifiers;

public class AccessModifiers {
    public static int publicDate = 200;

    protected static int protectedData = 300;

     static int defaultData ;

     private static int privateData = 100;



     public AccessModifiers(){

     }

public static void publicMethod(){
    System.out.println("Public");
}

protected  static void protectedMethod(){
    System.out.println("Protected Method");
}

static void defaultMethod(){
    System.out.println("Default Method");

}
 private static void privateMethod(){
     System.out.println("Private Method");
 }

    public static void main(String[] args) {

        System.out.println(publicDate);
        System.out.println(protectedData);
        System.out.println(defaultData);
        System.out.println(privateData);

        new AccessModifiers();

    }






}
