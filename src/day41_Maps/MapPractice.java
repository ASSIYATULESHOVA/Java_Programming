package day41_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {

        Map<String,Object> person1 = new LinkedHashMap<>();
        person1.put("name","Arthur");
        person1.put("gender",'M');
        person1.put("Age",32);
        person1.put("Job_title", "Developer");
        person1.put("Salary",100000.50);
        person1.put("Married",true);
        System.out.println(person1);

        System.out.println(person1.get("name"));
        System.out.println(person1.get("Salary"));
        System.out.println(person1.get("Job_title"));

    }
}
