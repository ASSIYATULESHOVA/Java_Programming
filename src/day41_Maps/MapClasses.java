package day41_Maps;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        Map<String,Integer>  hashMap = new HashMap<>(); //random order accepts null as a value
        hashMap.put("Daniel",95000);
        hashMap.put("Emily",100000);
        hashMap.put("Bella",85000);
        hashMap.put("Aaron",78000);
        hashMap.put("Chris",null);
        hashMap.put(null,120000);
        System.out.println("Hash map "+hashMap);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Map<String,Integer> LinkedHashMap = new LinkedHashMap<>(); // keeps the order accepts null as a value
        LinkedHashMap.put("Daniel",95000);
        LinkedHashMap.put("Emily",100000);
        LinkedHashMap.put("Bella",85000);
        LinkedHashMap.put("Aaron",78000);
        LinkedHashMap.put("Chris",null);
        LinkedHashMap.put(null,120000);

        System.out.println("Linked hash map "+LinkedHashMap);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        Map<String,Integer> TreeMap = new TreeMap<>(); // sorted order null key not accepted
        TreeMap.put("Daniel",95000);
        TreeMap.put("Emily",100000);
        TreeMap.put("Bella",85000);
        TreeMap.put("Aaron",78000);
        TreeMap.put("Chris",null);
        //TreeMap.put(null,120000);

        System.out.println("Tree map "+TreeMap);

        System.out.println("-----------------------------------------------------------------");
        Map<String,Integer> hashtable = new Hashtable<>(); // random order null key not accepted

        hashtable.put("Daniel",95000);
        hashtable.put("Emily",100000);
        hashtable.put("Bella",85000);
        hashtable.put("Aaron",78000);
       try{
           hashtable.put("Chris",100000);
       }catch (RuntimeException e){
           e.printStackTrace();
       }


        System.out.println("Hash table "+hashtable);














    }
}
