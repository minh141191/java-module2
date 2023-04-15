package day10;

public interface Manage {
    void displayAll();
    void addStudent(Student student);
    int findStudentByName(String name);
    void removeStudent(int id);
    void updateStudent(int id);
    void sortStudentByAvg();
    void sortStudentByAvg2();
    void sumAvg();
}
