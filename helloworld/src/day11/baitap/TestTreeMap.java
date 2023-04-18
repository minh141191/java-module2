package day11.baitap;

import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> myMap = new TreeMap<>();
        String str1 = "file edit edit view";
        String[] arrStr = str1.toLowerCase().split(" ");

        for (String s : arrStr) {
            if (myMap.containsKey(s)) {
//                int count = myMap.get(s);
//                count++;
                myMap.replace(s, myMap.get(s) + 1);
            } else {
                myMap.put(s, 1);
            }
        }
        System.out.println(myMap.toString());
    }
}
