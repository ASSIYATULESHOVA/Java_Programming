package day07_IfSteatements;

public class LoanApplication {
    public static void main(String[] args) {

        int salary = 50000;
        int creditScore = 700;

        if(salary >= 45000 && creditScore >= 700){
            System.out.println("You are eligible for the loan");
        }else{
            System.err.println("You are not eligible");
        }
    }
}
