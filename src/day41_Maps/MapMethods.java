package day41_Maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {

        Map<String , String > map = new TreeMap<>();

        map.put("C02","Josh"); // Asiya
        map.put("C03","Nora");
        map.put("C04","Khan"); // David
        map.put("C05","Tatiana");
        map.put("C01","Molly");
        map.put("C07","Tatiana"); // Lucy

        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.get("C07"));
        map.put("C07","Lucy");
        map.put("C04","David");

        System.out.println(map);

        System.out.println(map.get("C02"));  // Josh

        map.replace("C02","Asiya");
        map.replace("C03","Marika");

        System.out.println(map);

        map.remove("C03");
        System.out.println(map);

        map.remove("C05");

        System.out.println(map);

        System.out.println(map.containsKey("C03"));
        System.out.println(map.containsKey("C02"));
        System.out.println(map.containsValue("Anna"));
        System.out.println(map.containsValue("Asiya"));

        System.out.println(map.isEmpty()); // false

        System.out.println(map.equals(map));

       // map.clear();
        System.out.println(map);






    }
}
