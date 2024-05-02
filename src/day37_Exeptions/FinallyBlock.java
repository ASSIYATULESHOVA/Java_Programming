package day37_Exeptions;

public class FinallyBlock {
    public static void main(String[] args) {

        System.out.println("Program Started");

        try{
            System.out.println( 9/0);
        }catch (NullPointerException e){
            System.out.println("Run time EXC has been caught");
            e.printStackTrace();
            System.exit(1);
        }finally {
            System.out.println("Finally Block");
        }

        System.out.println("Program Ended");

    }
}
