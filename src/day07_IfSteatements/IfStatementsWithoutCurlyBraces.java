package day07_IfSteatements;

public class IfStatementsWithoutCurlyBraces {
    public static void main(String[] args) {
        
        int age = 22;
        if(age >= 21){
            System.out.println("Eligible");
        }else{
            System.err.println("Not Eligible");
        }

        System.out.println("---------------------------------");
        
        if(age>= 21) System.out.println("Eligible");
        else System.out.println("Not Eligible");

        System.out.println("------------------------------");
        
        int day = 1;

        if(day == 1) System.out.println("Monday");
        if(day == 2) System.out.println("Tuesday");
        if(day == 3) System.out.println("Wednesday");
        if(day == 4) System.out.println("Thursday");
        if(day == 5) System.out.println("Friday");
        if(day == 6) System.out.println("Saturday");
        if(day == 7) System.out.println("Sunday");
       // else System.out.println("Sunday");


        // IF STATEMENT WITHOUT CURLY BRACES IS NOT A GOOD PRACTICE

    }
}
