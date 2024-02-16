package day38_Exceptions.ShapeTask;

public class Circle {

    private double Radius;

    public Circle(double radius) {
       setRadius(radius);
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        if(radius <= 0){
            throw new InvalidShapeException();
        }
        Radius = radius;
    }
}
