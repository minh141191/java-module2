package minitest.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFileOfStudent {

    public void wirterFile(List<Student> students) {
        File file = new File("src/minitest/data/student.txt");
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));) {
            for (Student student :students) {
                bufferedWriter.write(student.toString() + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Student> readFile() {
        List<Student> students = new ArrayList<>();
        File file = new File("src/minitest/data/student.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(", ");
                Student student = new Student();
                student.setId(Integer.parseInt(strings[0]));
                student.setName(strings[1]);
                student.setAge(Integer.parseInt(strings[2]));
                student.setGender(strings[3]);
                student.setAvgPoint(Integer.parseInt(strings[4]));
                student.setClassroom(new Classroom(strings[5]));
                students.add(student);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return students;
    }
}
