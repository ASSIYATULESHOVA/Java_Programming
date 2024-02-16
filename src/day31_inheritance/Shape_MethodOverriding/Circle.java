package day31_inheritance.Shape_MethodOverriding;

public class Circle extends Shape{

   private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
      setRadius(radius);
    }

    public Circle() {
        super();
    }

    @Override
    public double area() {
        return radius * radius * 3.14;
    }

    @Override
    public double perimeter() {
        return 6.28 * radius;
    }

    @Override
    public void draw() {
        // code to draw circle
    }


    @Override
    public String toString() {
        return getClass().getSimpleName()+"{"+
                "name='" + getName() + '\'' +
                ", radius ='" +  radius + '\'' +
                ", area ='" + area() + '\'' +
                ", perimeter ='" + perimeter() + '\'' +
                '}';
    }
}
