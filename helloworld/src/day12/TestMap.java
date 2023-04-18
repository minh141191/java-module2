package day12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> myHashMap = new HashMap<>();
        myHashMap.put("Hiếu", 28);
        myHashMap.put("Lâm", 25);
        myHashMap.put("Duong", 23);
        myHashMap.put("Dung", 23);
        System.out.println("Hiện thị danh sách trong HashMap");
        System.out.println(myHashMap);

        Map<String, Integer> myTreeMap = new HashMap<>(myHashMap);
        System.out.println("Hiện thị danh sách theo thứ tự giảm dần");
        System.out.println(myTreeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Hiếu", 28);
        linkedHashMap.put("Lâm", 25);
        linkedHashMap.put("Duong", 23);
        linkedHashMap.put("Dung", 24);
        System.out.println("\nTuổi của " + "Dung là : " + linkedHashMap.get("Dung"));
    }
}
