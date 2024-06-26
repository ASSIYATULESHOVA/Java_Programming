package day07_IfSteatements;

public class NetIncomeCalc {
    public static void main(String[] args) {

        int salary = 100000;
        boolean isMarried = true;
        double taxRate = 0;

        if(salary >= 130000){ // if the salary is 130k or more, then the tax rate should be 35%
            taxRate = 0.35;
        }

        if(salary >= 100000 && salary < 130000){ // if the salary is between 100k to 130k (excluded), then the tax rate should be 30%
            taxRate = 0.3;
        }

        if(salary >= 80000 && salary < 100000){ // if the salary is between 80k to 100k (excluded), then the tax rate should be 25%
            taxRate = 0.25;
        }

        if(salary < 80000){ // if the salary is  less than 80k, then the tax rate should be 20%
            taxRate= 0.2;
        }


        if(isMarried){  // if the person is married
            taxRate -= 0.05; //tax is reduced by 5%
        }

        double totalTax = salary * taxRate;
        double netIncome = salary - totalTax;

        System.out.println("salary = " + salary);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);



    }
}
