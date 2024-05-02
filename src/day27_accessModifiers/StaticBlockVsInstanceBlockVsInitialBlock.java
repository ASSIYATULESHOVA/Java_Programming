package day27_accessModifiers;

public class StaticBlockVsInstanceBlockVsInitialBlock {


    public StaticBlockVsInstanceBlockVsInitialBlock(){
        System.out.println("Constructor");
    }

    {
        System.out.println("Instance Block");
    }

    static{
        System.out.println("Static Block");
    }

    public static void main(String[] args) {

        System.out.println("Main Method");

        new StaticBlockVsInstanceBlockVsInitialBlock();
        new StaticBlockVsInstanceBlockVsInitialBlock();



    }

















}
