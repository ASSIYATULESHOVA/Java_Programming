package day38_Exceptions.ShapeTask;

public class InvalidShapeException extends RuntimeException{

    public InvalidShapeException(){
        System.out.println("Invalid shape");
    }
}
