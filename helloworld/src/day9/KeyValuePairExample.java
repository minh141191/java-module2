package day9;

public class KeyValuePairExample {
    public static void main(String[] args) {
//        List<Integer> integerBox = new ArrayList<>();
        KeyValuePair<String, Integer> entry = new KeyValuePair<>("codegym", 12345);
        String name = entry.getKay();
        Integer id = entry.getValue();
        System.out.println("name = " + name +  "id = " + id);
    }
}
