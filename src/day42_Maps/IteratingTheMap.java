package day42_Maps;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingTheMap {
    public static void main(String[] args) {

        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("Daniel",95000);
        map.put("Emily",100000);
        map.put("Bella",85000);
        map.put("Aaron",78000);
        map.put("Jimmy",78000);
        //map.put("Aaron",78000);
        map.put("Brianna",98000);

        System.out.println(map);

        System.out.println("---------------------------------------------------");

        for (String eachKey : map.keySet()) {
            //map.replace(eachKey, map.get(eachKey) *2);
              System.out.println(eachKey);
        }
     //   System.out.println(map);

        System.out.println("---------------------------------------------------");

        for (Integer eachValue : map.values()) {

            System.out.println(eachValue);
        }

        System.out.println("---------------------------------------------------");


        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            System.out.println(eachEntry);
        }

        System.out.println("---------------------------------------------------");

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
        String eachKey = eachEntry.getKey();
        Integer eachValue = eachEntry.getValue();
        eachEntry.setValue(eachValue+ 10000);
            System.out.println(eachKey+" : "+eachValue);
        }

        System.out.println(map);


    }
}
