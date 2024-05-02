package day06_IfStatements;

public class NumberOfDays {
    public static void main(String[] args) {

        int n = 10;

        boolean has28Days = n == 2;
        boolean has30Days = n == 4 || n == 6 || n ==9 || n == 11;
        boolean has31Days = !has28Days && !has30Days;

        String result = "";

        if(has28Days){
            result = " 28 Days";
        }
        if(has30Days){
            result = "30 Days";
        }
        if(has31Days){
            result = "31 Days";
        }

        System.out.println(result);
    }
}
