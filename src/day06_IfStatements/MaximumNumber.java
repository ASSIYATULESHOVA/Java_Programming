package day06_IfStatements;

public class MaximumNumber {
    public static void main(String[] args) {

        int n1 = 1000,
                n2 = 10000;

        if( n1 > n2){
            System.out.println(n1 + " is the maximum number");
        }

        if( n2 > n1){
            System.out.println(n2 + " is the maximum number");
        }

        if(n1 == n2){
            System.out.println("Equal");
        }




    }
}
