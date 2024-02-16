package day25_constructor;

public class ConstructorIntro {

    public ConstructorIntro(int a){
        System.out.println("Object is created by using int argument");
    }
    public ConstructorIntro(){
        System.out.println("Object is created by using no argument constructor");




    }

    public static void add(){

    }


    public static void main(String[] args) {

        ConstructorIntro obj1 =  new ConstructorIntro(10);

        ConstructorIntro obj3 =  new ConstructorIntro();

        //ConstructorIntro obj =  new ConstructorIntro("Java");





    }




}
