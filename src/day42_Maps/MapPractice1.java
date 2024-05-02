package day42_Maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {

        Map<String ,String> employeeMap = new HashMap<>();

        employeeMap.put("Dena","F");
        employeeMap.put("Winny","M");
        employeeMap.put("Jereme","M");
        employeeMap.put("Glad","F");
        employeeMap.put("Desire","F");
        employeeMap.put("Kalina","F");
        employeeMap.put("Bernardo","M");
        employeeMap.put("Aila","F");
        employeeMap.put("Brigitte","F");
        employeeMap.put("Derek","M");
        employeeMap.put("Orlando","M");
        employeeMap.put("Selle","F");
        employeeMap.put("Marika","F");

        System.out.println("-------------------------------------------------");

        int countMaleEmployees = 0;
        int countFemaleEmployees = 0;
/*
        for (String name : employeeMap.keySet()) {
            String gender = employeeMap.get(name);
            if(gender.equals("M")){
                countMaleEmployees++;
            }else{
                countFemaleEmployees++;
            }
        }

 */

        for (String eachValue : employeeMap.values()) {
            if(eachValue.equals("F")){
                countFemaleEmployees++;
            }else{
                countMaleEmployees++;
            }
        }

        System.out.println("Count male employee "+countMaleEmployees);
        System.out.println("Count female employee "+countFemaleEmployees);

        System.out.println("-------------------------------------------------");
/*
        for (String name : employeeMap.keySet()) {
            String gender = employeeMap.get(name);
            if(gender.equals("F")){
                System.out.println(name);
            }
        }

 */

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if(eachEntry.getValue().equals("F")){
                System.out.println(eachEntry.getKey());
            }
        }
        System.out.println("-------------------------------------------------");

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if(eachEntry.getValue().equals("M")){
                eachEntry.setValue("Male");
            }else {
                eachEntry.setValue("Female");
            }
        }









    }
}
