package day27_accessModifiers;

public class StaticBlock {

   public StaticBlock(){
       System.out.println("Constructor");
   }

  static{
      System.out.println("Static Block");


  }

    public static void main(String[] args) {
        System.out.println("Main method");

        new StaticBlock();
        new StaticBlock();
        new StaticBlock();



    }


}
