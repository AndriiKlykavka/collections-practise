package collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Andrii");
        map1.put(200, "Arkadii");
        map1.put(5000, "Valerii");
        map1.put(500, "Georgii");
        map1.putIfAbsent(1000, "Serhii");
        System.out.println(map1);
//        System.out.println(map1.get(200));
        map1.remove(5000);
//        System.out.println(map1);
//        System.out.println(map1.containsValue("Arkadii"));

        System.out.println(map1.containsKey(501));

        System.out.println(map1.values());

        Map<String, String> map2 = new HashMap<>();

        map2.put("Alex", "Beautiful");
    }
}
