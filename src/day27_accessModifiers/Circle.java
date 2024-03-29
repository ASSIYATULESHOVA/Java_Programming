package day27_accessModifiers;

public class Circle {

    public double radius, diameter;

    public static double pi = 3.14;

    public Circle(double radius){
      this.radius = radius;
      diameter = radius * 2;
    }

/*    public static double calcArea (){ // static accepts only statics
        return radius * radius * pi;
    }
*/

    public double calcArea(){
        return radius * radius * pi;
    }

    public double calcPerimeter(){
        return diameter * pi;
    }


    public static void printPiValue(){
        System.out.println("PI's value is "+pi);
    }


    public String toString() {
        return "Circle{" +
                "radius =" + radius +
                ", diameter =" + diameter +
                ", PI =" + pi +
                ", calcArea =" + calcArea() +
                ", perimeter =" + calcPerimeter()+
                '}';
    }
}
