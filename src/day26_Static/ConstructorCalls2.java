package day26_Static;

public class ConstructorCalls2 {
    public ConstructorCalls2(){
        System.out.println("Default");
    }

    public ConstructorCalls2(int a){
        this(); // calling default cons
        //this("Java"); can not call more than 1 cons
        System.out.println("int arg");
    }

    public ConstructorCalls2(String b){
        this(10);  // calling int cons
        System.out.println("String arg");
    }
    public ConstructorCalls2(double c){
        System.out.println("double arg");
    }

    public static void main(String[] args) {

        ConstructorCalls2 obj1 = new ConstructorCalls2();

        System.out.println("*****************************************");

        ConstructorCalls2 obj2 = new ConstructorCalls2(10);

        System.out.println("*****************************************");

        ConstructorCalls2 obj3 = new ConstructorCalls2("Java");

        System.out.println("*****************************************");

        ConstructorCalls2 onj4 = new ConstructorCalls2(2.5);

        System.out.println("*****************************************");



    }
}
