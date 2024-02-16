package day26_Static;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("Default constructor");
    }
    public ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int");
    }

    public ConstructorCalls(double b){
        System.out.println("Constructor with double argument");
    }
    public ConstructorCalls(String c){
        this(2.5);
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {

        method1();
        method2();
    }
 public static void method1(){
     System.out.println("Method 1");
 }

    public static void method2(){
        method1();
        System.out.println("Method 2");
    }
}
