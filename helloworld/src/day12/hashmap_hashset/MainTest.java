package day12.hashmap_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainTest {
    public static void main(String[] args) {
        Student student1 = new Student("Dũng", 26, "HN");
        Student student2 = new Student("Tuấn", 27, "ĐN");
        Student student3 = new Student("Thái", 28, "HCM");

        Map<Integer, Student> studentMap = new HashMap<>() ;
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(3, student3);

        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }
        System.out.println("----------.Set");
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);

        for (Student student : studentSet) {
            System.out.println(student);
        }
    }
}
