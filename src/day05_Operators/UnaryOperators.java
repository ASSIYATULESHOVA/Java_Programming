package day05_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        // PRE INCREMENT / DECREMENT

        int x = 10 ;
        System.out.println(++x); //11
        System.out.println(x);

        int y = 100;

        System.out.println(--y); // 99
        System.out.println(y);  // 99

        System.out.println("---------------------------------------");

        // POST INCREMENT / DECREMENT

        int a = 50;

        System.out.println(a++); // 50
        System.out.println(a);  //51

        int b = 25;

        System.out.println(b--); // 25
        System.out.println(b);  // 24

        System.out.println("---------------------------------------");

        int n = 30;

        int m = n++ ;

        System.out.println("n = "+n); //31
        System.out.println("m = "+m); // 30

        int z = 60;

        int q = z--;

        System.out.println("q = "+q); //60
        System.out.println("z = "+z); // 59

    }
}
