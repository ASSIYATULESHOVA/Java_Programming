package day05_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {

        int a = 20;

        System.out.println(a); //20
        System.out.println(a); //20

        a = 40;

        System.out.println(a); // 40

        a = 90;

        System.out.println(a); // 90

        System.out.println("---------------------------------------");

        double balance = 100;
         balance += 1000; // balance = 100 + 1000

        System.out.println("Balance = "+balance); // 1100.0

        balance -= 500;

        System.out.println("Balance = "+balance); // 1100 - 500 = 600

        System.out.println("---------------------------------------");

        double salary = 45000;

        System.out.println(salary); // 45000

        salary *= 2;

        System.out.println(salary); //90000

        salary *= 3;

        System.out.println(salary); // 270000

        System.out.println("---------------------------------------");

        double eth = 4;
        eth *= 250;

        System.out.println(eth); // 1000

        eth /= 2;

        System.out.println(eth); //500

        System.out.println("---------------------------------------");

        System.out.println("Salary = "+ salary);

        salary /=2;

        System.out.println(salary); // 135000

        System.out.println("---------------------------------------");

        int b = 39;

        b %= 7; // 39 % 7

        System.out.println(b); // 4








    }
}
