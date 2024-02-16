package day36_Polymorphism;

public class Circle {
    private double radius;
    public final static double PI = 3.14;

    @Override
    public String toString() {
        return "Circle{" +
                "Radius =" + radius +
                "Area =" + calcArea() +
                "Perimeter =" + calcPerimeter() +
                '}';
    }
    public double calcArea(){
        return getRadius() * getRadius() * PI;
    }
    public double calcPerimeter(){
        return 2 * getRadius() * PI;
    }
    public Circle(double radius){
       setRadius(radius);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object obj) {
       if(!(obj instanceof Circle) ){
           System.err.println("Invalid Object");
           System.exit(1);
       }
     if(this.radius == ((Circle) obj).radius) {
          return true;
     }
       return false;
    }
}
