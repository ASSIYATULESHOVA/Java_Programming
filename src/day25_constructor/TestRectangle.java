package day25_constructor;

public class TestRectangle {
    public static void main(String[] args) {
/*
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setInfo(3,4);
        Rectangle rectangle2 = new Rectangle();
        rectangle2.setInfo(3,4);
        Rectangle rectangle3 = new Rectangle();
        rectangle3.setInfo(3,4);
        Rectangle rectangle4 = new Rectangle();
        rectangle4.setInfo(3,4);
        Rectangle rectangle5 = new Rectangle();
        rectangle5.setInfo(3,4);
*/


        Rectangle rectangle1 = new Rectangle(4,5);
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle(5,5);
        System.out.println(rectangle2);
        Rectangle rectangle3 = new Rectangle(6,5);
        System.out.println(rectangle3);
        Rectangle rectangle4 = new Rectangle(7,5);
        System.out.println(rectangle4);
        Rectangle rectangle5 = new Rectangle(8,5);
        System.out.println(rectangle5);


    }
}
