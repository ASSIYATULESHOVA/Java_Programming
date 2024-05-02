package day07_IfSteatements;

public class Grade {
    public static void main(String[] args) {

        char grade = 'A';
        String result = "";

        if(grade == 'A'){
            result = "Excellent";
        }
        if(grade == 'B'){
            result = "great job";
        }
        if(grade == 'C'){
            result = "Good";
        }
        if(grade == 'D'){
            result = "Passed";
        }
        if(grade == 'F'){
            result = "Failed";
        }
        System.out.println(result);

    }
}
