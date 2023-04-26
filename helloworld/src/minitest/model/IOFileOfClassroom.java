package minitest.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFileOfClassroom {

    public void writeFile(List<Classroom> classrooms) throws IOException {
        File f = new File("src/minitest/data/classroom.txt");
        FileWriter fileWriter = new FileWriter(f);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Classroom classroom : classrooms) {
            bufferedWriter.write(classroom.toString() + "\n");
        }
        bufferedWriter.close();
        fileWriter.close();
    }

    public List<Classroom> readFile() {
        List<Classroom> classrooms = new ArrayList<>();
        File f = new File("src/minitest/data/classroom.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] arrStr = line.split(", ");
                Classroom classroom = new Classroom();
                classroom.setId(Integer.parseInt(arrStr[0]));
                classroom.setName(arrStr[1]);
                classrooms.add(classroom);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return classrooms;
    }
}