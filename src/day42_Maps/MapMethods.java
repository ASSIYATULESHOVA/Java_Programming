package day42_Maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {

        Map<String,String> map = new TreeMap<>();
        map.put("C02","Josh");
        map.put("B03","Nora");
        map.put("A02","Molly");
        map.put("D02","Asiya");
        map.put("A03","Tatiana");

        Map<String,String> employees = new TreeMap<>();
        employees.putAll(map);
        System.out.println(employees);

        System.out.println(map==employees); // false
        System.out.println(map.equals(employees)); // true



    }
}
