package day12.baicuangu;

import java.util.Map;
import java.util.TreeMap;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Map<Integer, Integer> myMap = new TreeMap<>();
        int[] arr = {1, 3, 5, 7, 3, 2, 1};

        for (Integer integer : arr) {
            if (myMap.containsKey(integer)) {
                myMap.replace(integer, myMap.get(integer) + 1);
            } else {
                myMap.put(integer, 1);
            }
        }
        for (Map.Entry<Integer, Integer> myMap1 : myMap.entrySet()) {
            System.out.println(myMap1.getKey() + " xuất hiện " + myMap1.getValue() + " lần");
        }
    }
}
